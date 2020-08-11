package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1926_그림 {
	static int N, M,answer,max;
	static int[][] paint;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		paint = new int[N][M];
		visit = new boolean[N][M];
		for(int i = 0; i< N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M;j++) {
				paint[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int cnt = 0;
		answer = 0;
		for(int i = 0 ; i < N;i++) {
			for(int j = 0; j < M;j++) {
				if(paint[i][j] == 1 && !visit[i][j]) {
					cnt++;
					max = 0;
					dfs(i,j);
					answer = Math.max(max, answer);
				}
			}
		}
		System.out.println(cnt);
		System.out.println(answer);
		
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		max++;
		for(int k = 0 ; k < 4;k++) {
			int ni = di[k] + i;
			int nj = dj[k] + j;
			
			if(ni>=0 && nj >= 0 && ni< N&& nj <M && !visit[ni][nj] && paint[ni][nj] == 1) {
				dfs(ni,nj);
			}
		}
	}

}
