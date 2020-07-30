package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14720_우유축제 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[][] dp = new int[N][3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if(arr[0] == 0)dp[0][0]= 1;
		
		for(int i = 1 ; i < N;i++) {
			int milk = arr[i];
			dp[i][0] = milk == 0? dp[i-1][2] + 1 : dp[i-1][0];
			dp[i][1] = milk == 1 && dp[i][2] < dp[i][0] ? dp[i-1][0] + 1 : dp[i-1][1];
			dp[i][2] = milk == 2 && dp[i][0] < dp[i][1] ? dp[i-1][1] + 1 : dp[i-1][2];
		}
		
		System.out.println(Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2])));

		
	}

}
