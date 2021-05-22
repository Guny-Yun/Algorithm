package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2133_타일채우기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		int[] dp = new int[N+1];
		if(N % 2 != 1) {
			dp[0] = 1;
			dp[2] = 3;
			
			for(int i = 4; i<= N; i+=2) {
				dp[i] = dp[i-2] * dp[2];
				
				for(int j = i - 4; j >=0;j-=2) {
					dp[i] += dp[j] * 2;
				}
			}
			answer = dp[N];
		}
		System.out.println(answer);
	}
}
