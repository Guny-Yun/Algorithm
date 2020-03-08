package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class V_Pos{
    int i;
    int j;
    int day;
    public V_Pos(int i, int j, int day) {
        this.i = i;
        this.j = j;
        this.day =day;
    }
}
public class Main_17142_연구소3 {
    static int N,M,mintime,cntsafety;
    static int[][] map;//,tap;
    static List<int[]> virus_list;
    static int[] on_off;
    static boolean[] visit;
    
    public static void bfs() {
    	int safebackup = cntsafety;
        int[] di = {-1,1,0,0};
        int[] dj = {0,0,-1,1};
        boolean[][] visit = new boolean[N][N];
        Queue<V_Pos> que = new LinkedList<V_Pos>();
        for(int i = 0;i<virus_list.size();i++) {
            if(on_off[i] == 1) {
                visit[virus_list.get(i)[0]][virus_list.get(i)[1]] = true;
                que.offer(new V_Pos(virus_list.get(i)[0],virus_list.get(i)[1],0));
            }
        }//활성화 시킨 바이러스들만 우선 que에 집어넣고 해당 바이러스 좌표 방문 처리
        int day = 0;
		while (!que.isEmpty()) {
			boolean flag =false;
			int n = que.size();
			for (int i = 0; i < n; i++) {
				V_Pos tmp = que.poll();
				for (int k = 0; k < 4; k++) {
					int ni = tmp.i + di[k];
					int nj = tmp.j + dj[k];
					if (ni >= 0 && nj >= 0 && ni < N && nj < N && !visit[ni][nj] && map[ni][nj] != 1) {
						if (map[ni][nj] == 2) {
							visit[ni][nj] = true;
							que.offer(new V_Pos(ni, nj,tmp.day+1));
						} else if (map[ni][nj] == 0) {
							safebackup--;
							flag =true;
							visit[ni][nj] = true;
							que.offer(new V_Pos(ni, nj,tmp.day+1));
						}
					}
				}
				if(flag) day = tmp.day+1;
			}
		} // while 끝
        if(safebackup== 0) {
            mintime = Math.min(day, mintime);
        }
    }
    public static void dfs(int level,int start) {// 활성화 시킬 바이러스 선택
        int n = virus_list.size();//바이러스들의 리스트중 몇번째 바이러스들을 활성화 시킬지 n개중 M개 선택
        if(level == M) {
        	if(mintime == 0)return;
            bfs();
            return;
        }
        for (int i = start; i < n; i++) {
            if (on_off[i] == 0) {
                on_off[i] = 1;
                dfs(level + 1,i);
                on_off[i] = 0;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        virus_list = new ArrayList<int[]>();
        cntsafety= 0;
        for(int i = 0 ;i<N;i++) {
            st= new StringTokenizer(br.readLine()," ");
            for(int j = 0 ; j<N;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2) virus_list.add(new int[] {i,j});
                else if(map[i][j] == 0)cntsafety++;
            }// 바이러스리스트에 바이러스의 좌표들을 집어넣는다
        }// 입력 끝
        mintime = Integer.MAX_VALUE;
        on_off = new int[virus_list.size()];//어느 바이러스들을 활성화시킬지 선택할 배열
        dfs(0,0);
        if(mintime == Integer.MAX_VALUE) {
        	mintime = -1;
        }
        System.out.println(mintime);//최소 시간 출력
    }//main 끝
}