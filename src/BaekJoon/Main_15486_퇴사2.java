package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15486_퇴사2 {

	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = Integer.MIN_VALUE;
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+2];
		int[] t = new int[N+2];
		int[] p = new int[N+2];
		for(int i =1 ; i <= N ;i++) {
			st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
			
		}
		for(int i =1 ; i<=N+1;i++) {
			max = Math.max(max, dp[i]);
			if(i + t[i] <= N+1) {
				dp[i+t[i]] = Math.max(max+p[i], dp[i+t[i]]);
			}
		}
		System.out.println(max);
	}

}
