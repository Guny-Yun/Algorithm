package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_12852_1로만들기2 {
	static int[] dp;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		dp= new int[N+1];
		for(int i =2; i <= N;i++) {
			dp[i] = dp[i-1] + 1;
			if(i%3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
			if(i %2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
		}
		System.out.println(dp[N]);
		print(N);
	}
	public static void print(int num) {
		if(num == 0)return;
		
		System.out.print(num + " ");
		
		if(num-1 >= 0 && dp[num-1] == dp[num]-1) {
			print(num-1);
		}else if(num%3 == 0 && dp[num/3] == dp[num]-1) {
			print(num/3);
		}else if(num % 2 == 0 && dp[num/2] == dp[num] -1) {
			print(num/2);
		}
		return;
	}
}
