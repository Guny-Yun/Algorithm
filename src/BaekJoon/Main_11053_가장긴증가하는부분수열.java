package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11053_가장긴증가하는부분수열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[N];
		int dp[] = new int[N];
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = 1;
		for(int i = 1;i<N;i++) {
			dp[i] = 1;
			for(int j = 0; j < N;j++) {
				if(arr[j] < arr[i] && dp[i] <= dp[j]) dp[i] = dp[j] +1;
			}
		}
		int answer = 0;
		for(int i : dp) {
			answer = Math.max(answer, i);
		}
		System.out.println(answer);
	}

}
