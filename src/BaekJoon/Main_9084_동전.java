package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9084_동전 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[N+1];
			for(int i = 1; i<= N;i++) arr[i] = Integer.parseInt(st.nextToken());
			
			int M = Integer.parseInt(br.readLine());
			int[] dp = new int[M+1];
			dp[0] =1;
			for(int i= 1; i<=N;i++) {
				for(int j = arr[i]; j<= M;j++) {
					dp[j] += dp[j-arr[i]];
				}
			}
			System.out.println(dp[M]);
		}
	}
}
