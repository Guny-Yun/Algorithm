package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_12865_평범한배낭 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] dp = new int[N + 1][K + 1];
		int[] weight = new int[N + 1];
		int[] value = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			weight[i] = w;
			value[i] = v;
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - weight[i] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]]+ value[i]);
				}
			}
		}
		System.out.println(dp[N][K]);
	}
}
