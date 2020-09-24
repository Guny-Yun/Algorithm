package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14716_현수막 {
	static int M, N, cnt;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,-1,-1,0,1,1,1,0};
	static int[] dj = {-1,0,1,1,1,0,-1,-1};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[M][N];
		visit = new boolean[M][N];
		for(int i = 0 ; i < M;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		cnt = 0;
		
		for(int i = 0 ; i < M;i++) {
			for(int j = 0 ; j < N;j++) {
				if(map[i][j] == 1 && !visit[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		
		for(int k = 0 ; k < 8;k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			
			if(ni >= 0 && ni < M && nj >= 0 && nj <N && map[ni][nj] == 1 && !visit[ni][nj]) {
				dfs(ni,nj);
			}
		}
	}

}
