package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9465_스티커 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T;tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[2][N+1];
			int[][] dp=  new int[N+1][3];
			StringTokenizer st;
			for(int i = 0 ; i <2;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1; j <=N;j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			dp[1][0] = 0;
			dp[1][1] = arr[0][1];
			dp[1][2] = arr[1][1];
			
			for(int i = 2; i<=N;i++) {
				dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1],dp[i-1][2]));
				dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + arr[0][i];
				dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + arr[1][i];
				
			}
			System.out.println(Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2])));
		}
	}
}
