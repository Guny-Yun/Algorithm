package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11058_크리보드 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] dp = new long[101];
		
		for(int i = 1; i <= N;i++) {
			dp[i] = dp[i-1]+1;
			for(int j = 1; j <= i - 3;j++) {
				dp[i] = Math.max(dp[i], (j+1) * dp[i-(j+2)]);
			}
		}
		System.out.println(dp[N]);
	}
}
