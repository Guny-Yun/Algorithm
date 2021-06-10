package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11060_점프점프 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int[] dp = new int[N];
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = -1;
		}
		dp[0] = 0;
		for(int i =1 ; i< N;i++) {
			for(int j = 0 ; j < i; j++) {
				if(dp[j] != -1 && i - j <= arr[j]) {
					if(dp[i] == -1 || dp[i] > dp[j] +1) {
						dp[i] = dp[j] +1;
					}
				}
			}
		}
		System.out.println(dp[N-1]);
	}
}
