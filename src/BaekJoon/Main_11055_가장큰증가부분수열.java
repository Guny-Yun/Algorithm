package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11055_가장큰증가부분수열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] dp = new int[N+1];
		int[] val = new int[N+1];
		
		for(int i =1 ; i<= N;i++) {
			val[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[1] = val[1];
		for(int i =2 ; i<= N;i++) {
			dp[i] = val[i];
			for(int j =1 ;j <= i;j++) {
				if(val[i] > val[j])
					dp[i] = Math.max(dp[j] + val[i], dp[i]);
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i = 1; i <= N;i++) {
			if(dp[i] > max)max = dp[i];
		}
		System.out.println(max);
	}
}
