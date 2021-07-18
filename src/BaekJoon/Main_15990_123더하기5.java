package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15990_123더하기5 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long answer;
		long[][] dp = new long[100001][4];
		dp[1][1] = dp[2][2] = dp[3][3] = 1;
		
		for(int i =1 ; i < dp.length;i++) {
			if(i > 1) dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
			if(i > 2) dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
			if(i > 3) dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
		}
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			answer = (dp[N][1] + dp[N][2] + dp[N][3] )%1000000009;
			System.out.println(answer);
		}
	}
}
