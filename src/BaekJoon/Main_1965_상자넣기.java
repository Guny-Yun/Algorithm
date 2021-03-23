package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1965_상자넣기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+2];
		int[] dp = new int[N+2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i<=N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		int answer = 0;
		for(int i = 1 ;i<=N;i++) {
			for(int j = 1;j <=i;j++) {
				if(arr[j] < arr[i])dp[i] = Math.max(dp[i], dp[j]+1);
			}
			answer = Math.max(answer, dp[i]);
		}
		System.out.println(answer);
	}
}
