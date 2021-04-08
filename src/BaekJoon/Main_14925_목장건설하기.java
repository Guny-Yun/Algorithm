package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14925_목장건설하기 {

	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int answer = 0;
		int[][] dp = new int[M+1][N+1];
		
		for(int i = 1; i <= M ;i++) {
			st= new StringTokenizer(br.readLine());
			for(int j =1 ; j<= N; j++) {
				if(Integer.parseInt(st.nextToken()) == 0) {
					int min = Integer.MAX_VALUE;
					min = Math.min(Math.min(Math.min(min, dp[i-1][j]), dp[i][j-1]), dp[i-1][j-1]);
					dp[i][j] = min +1;
					if(answer < dp[i][j]) answer = dp[i][j];
				}
			}
		}
		System.out.println(answer);
	}
}
