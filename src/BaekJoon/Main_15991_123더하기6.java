package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15991_123더하기6 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[100001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 2;
		dp[4] = 3;
		dp[5] = 3;
		dp[6] = 6;
		for(int i = 7; i <= 100000; i++) 
			dp[i] = (dp[i-2] + dp[i-4] + dp[i-6]) % 1000000009;
		
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			System.out.println(dp[tmp]);
		}
	}

}
