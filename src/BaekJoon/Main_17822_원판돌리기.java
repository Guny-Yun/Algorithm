package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_17822_원판돌리기 {
	static int n, m;
	static boolean[][] visit;
	static boolean chk;
	static LinkedList<Integer>[] listarr;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void dfs(int i , int j) {
		for(int k = 0; k<4;k++) {
			int ni = i+di[k];
			int nj = j+dj[k];
			if(nj == -1)nj = m-1;
			if(nj == m)nj = 0;
			if(ni>=0 && ni<n && !visit[ni][nj]) {
				if(listarr[i].get(j) == listarr[ni].get(nj)) {
					chk = true;
					visit[ni][nj] = true;
					dfs(ni,nj);
//					visit[i][j] = false;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());// n개 원판
		m = Integer.parseInt(st.nextToken());// m개의 수
		int t = Integer.parseInt(st.nextToken());//총 몇번 시행?
		listarr = new LinkedList[n];
		visit = new boolean[n][m];
		chk = false;
		for(int i = 0 ; i<n;i++) {
			listarr[i] = new LinkedList<Integer>();
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j <m;j++) {
				listarr[i].add(Integer.parseInt(st.nextToken()));
			}// n개의 원판에 m개의 수들 입력 끝
		}
		st= new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(st.nextToken());// x의 배수들
		int d = Integer.parseInt(st.nextToken());// 0=시계 1=반시계
		boolean clock = false;
		if(d==0)clock = true;//true면 시계방향
		int k = Integer.parseInt(st.nextToken());// k번 돌리기
		int sum = 0;
		for(int tc= 1; tc<=t; tc++) {
			for(int i = 0; i<n;i++) {
				if((i+1)%x == 0) {//x배수의 원판들을
					for(int rotate = 0; rotate<k;rotate++) {
						if(clock) {//시계방향이면?
							listarr[i].addFirst(listarr[i].pollLast());
						}else if(!clock) {
							listarr[i].addLast(listarr[i].pollFirst());
						}
					}
				}
			}//k번 돌리기
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (!visit[i][j]) {
						visit[i][j] = true;
						dfs(i, j);
//						visit[i][j] = false;
					}
				}
			}
			if(chk) {// 동일한 숫자가 있었으면
				for(int i = 0 ; i<n;i++) {
					for(int j = 0; j<m;j++) {
						if(!visit[i][j])listarr[i].set(j, 0);
					}
				}
			}
			else if(!chk) {//동일한 숫자가 없었으면	
				int cnt=0;
				int s = 0;
				for(int i = 0 ; i<n;i++) {
					for(int j = 0; j<m;j++) {
						if(listarr[i].get(j) !=0) {
							cnt++;
							s += listarr[i].get(j);
						}
					}
				}
				double avg =s/cnt;
				
				for(int i = 0 ; i<n;i++) {
					for(int j = 0; j<m;j++) {
						if(listarr[i].get(j)>avg && listarr[i].get(j) !=0)listarr[i].set(j, listarr[i].get(j)-1);
						if(listarr[i].get(j)<avg && listarr[i].get(j) !=0)listarr[i].set(j, listarr[i].get(j)+1);
					}
				}
			}//없었을떄 끝
		}//시행 횟수 끝
		for(int i = 0 ; i<n;i++) {
			for(int j = 0; j<m;j++) {
				if(listarr[i].get(j) !=0) {
					sum += listarr[i].get(j);
				}
			}
		}
		System.out.println(sum);
	}
}
