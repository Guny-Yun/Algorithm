package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15988_123더하기3 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long dp[] = new long[1000001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i = 4; i <= 1000000; i++) {
			dp[i] = (dp[i-1] + dp[i-2]+dp[i-3]) % 1000000009;
		}
		for(int i = 0 ; i < N;i++) {
			System.out.println(dp[Integer.parseInt(br.readLine())]);
		}
	}
}
