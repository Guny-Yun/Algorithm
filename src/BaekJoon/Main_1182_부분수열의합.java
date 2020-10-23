package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1182_부분수열의합 {
	static int N, S, cnt;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		cnt = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0, 0);
		if (S == 0)
			cnt--;

		System.out.println(cnt);
	}

	public static void dfs(int sum, int v) {
		if (v == N) {
			if (sum == S)
				cnt++;
			return;
		}
		dfs(sum + arr[v], v + 1);
		dfs(sum, v + 1);
	}
}
