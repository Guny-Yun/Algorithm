package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1486_장훈이의높은선반 {
	static int[] emp;
	static int N, B, res;
	static boolean[] visit;

	public static void dfs(int sum, int level) {
		if (res <= sum - B) return;
		if (sum >= B) {
			res = sum - B;
			return;
		}
		if (level == N)	return;
		dfs(sum+emp[level],level+1);
		dfs(sum,level+1);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			emp = new int[N];
			visit = new boolean[N];
			for (int i = 0; i < N; i++) {
				emp[i] = Integer.parseInt(st.nextToken());
			}
			res = Integer.MAX_VALUE;
			// 세팅 끝

			dfs(0, 0);
			System.out.println("#" + tc + " " + res);

		}
	}
}
