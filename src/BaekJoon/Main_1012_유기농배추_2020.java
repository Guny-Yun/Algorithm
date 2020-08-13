package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1012_유기농배추_2020 {
	static int N, M, res;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc =0; tc< T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			visit = new boolean[N][M];
			res = 0;
			for(int k = 0 ; k < K;k++) {
				st=  new StringTokenizer(br.readLine());
				int j = Integer.parseInt(st.nextToken());
				int i = Integer.parseInt(st.nextToken());
				map[i][j] = 1;
			}
			for(int i =0  ; i < N;i++) {
				for(int j = 0 ; j < M;j++) {
					if(map[i][j] == 1 && !visit[i][j]) {
						res++;
						dfs(i,j);
					}
				}
			}
			System.out.println(res);
		}
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		
		for(int k = 0 ; k < 4;k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			
			if(ni >=0 && nj >= 0 && ni < N && nj < M && map[ni][nj] == 1 && !visit[ni][nj]) {
				dfs(ni,nj);
			}
		}
	}

}
