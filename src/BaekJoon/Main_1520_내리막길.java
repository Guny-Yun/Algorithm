package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1520_내리막길 {
	
	static int[][] map;
	static int[][] dp;
	static int N, M;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[M+1][N+1];
		dp = new int[M+1][N+1];
		
		for(int i = 1 ; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1 ; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		int answer = dfs(1,1);
		
		System.out.println(answer);
	}
	public static int dfs(int i, int j) {
		dp[i][j] = 0;
		for(int k = 0 ; k < 4; k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			if(1 <= ni && 1 <= nj && ni <= M && nj <= N) {
				if(map[ni][nj] < map[i][j]) {
					if(ni == M && nj == N) {
						dp[i][j]++;
					}
					
					if(dp[ni][nj] >= 0) dp[i][j] += dp[ni][nj];
					else dp[i][j] += dfs(ni,nj);
				}
			}
		}
		return dp[i][j];
	}
}
