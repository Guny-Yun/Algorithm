package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1915_가장큰정사각형 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] dp= new int[1001][10001];
		int answer = 0;
		for(int i = 0; i < N; i++) {
			char[] tmp = br.readLine().toCharArray();
			for(int j = 0 ; j < M; j++) {
				dp[i+1][j+1] = tmp[j] - '0';
				if(dp[i+1][j+1] != 0) {
					int temp = Math.min(dp[i][j], dp[i][j+1]);
					dp[i+1][j+1] = Math.min(temp, dp[i+1][j]) + 1;
					answer = Math.max(answer, dp[i+1][j+1]);
				}
			}
		}
		System.out.println(answer * answer);
	}
}
