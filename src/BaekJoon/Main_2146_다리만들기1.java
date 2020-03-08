package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2146_다리만들기1 {
	static int N,cnt, min;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static Queue<int[]> que = new LinkedList<int[]>();
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		map[i][j] = cnt;
		for(int k = 0 ; k<4; k++) {
			int ni = i+di[k];
			int nj = j + dj[k];
			if(ni>=0 && ni<N && nj>=0 && nj<N && !visit[ni][nj] && map[ni][nj] == 1)
				dfs(ni,nj);
		}
	}
	public static void bfs(int island) {
		que.clear();	
		int d = 0;
		for(int r = 0;r<N;r++) {
			for(int c = 0 ; c<N;c++) {
				if(map[r][c] == island)que.offer(new int[] {r,c,d});
			}
		}
		while(!que.isEmpty()) {
			int[] tmp = que.poll();
			d = tmp[2];
			visit[tmp[0]][tmp[1]] = true;
			for(int k = 0 ; k<4;k++) {
				int ni = tmp[0] + di[k];
				int nj = tmp[1] + dj[k];
				if(ni>=0 && ni<N && nj>=0 && nj<N && !visit[ni][nj]) {
					if(map[ni][nj] == 0) {
						que.offer(new int[] {ni,nj,d+1});
					}else if(map[ni][nj] != 0 && map[ni][nj] != island) {
						min = Math.min(min, d);
					}
				}
			}
		}
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N][N];
		for(int i = 0; i<N;i++) {
			st= new StringTokenizer(br.readLine());
			for(int j = 0 ; j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		min = 1000;
		cnt = 1;
		for(int i = 0 ;i<N;i++) {
			for(int j = 0 ;j<N;j++) {
				if(map[i][j] ==1 && !visit[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		for(int i = 1; i<=cnt;i++) {
			visit = new boolean[N][N];
			bfs(i);
		}
		System.out.println(min);
	}

}
