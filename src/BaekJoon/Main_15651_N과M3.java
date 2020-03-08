package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15651_N과M3{
	static boolean[] visit;
	static int[] arr;
	static int[] res;
	static int N, M;
	static StringBuilder sb = new StringBuilder();

	public static void dfs(int r, int i) {
		if (r == M) {
			for (int k = 0; k < r; k++) {
				sb.append(res[k] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int j = 0; j < N; j++) {
			res[r] = arr[j];
			dfs(r + 1, j + 1);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		res = new int[N];
		visit = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		dfs(0, 0);
		System.out.println(sb.toString());
	}
}