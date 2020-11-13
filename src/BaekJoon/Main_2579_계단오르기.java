package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2579_계단오르기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dp[] = new int[N + 1];
		int tmp[] = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			tmp[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = tmp[1];
		if(N >= 2) {
			dp[2] = tmp[1] + tmp[2];
		}
		for(int i = 3; i<= N;i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + tmp[i-1]) + tmp[i];
		}
		System.out.println(dp[N]);
	}
}
