package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2302_극장좌석 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] dp= new int[N+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2 ; i <= N;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		int answer = 1;
		int cur =0;
		for(int i =0;i<M;i++) {
			int tmp = Integer.parseInt(br.readLine());
			answer *= dp[tmp-cur-1];
			cur = tmp;
		}
		
		answer *= dp[N-cur];
		System.out.println(answer);
	}
}
