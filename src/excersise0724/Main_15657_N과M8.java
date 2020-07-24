package excersise0724;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15657_N과M8 {
	static int N, M, res[], arr[];
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		res = new int[N];
		visit = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		dfs(0, 0);
		System.out.println(sb.toString());
	}

	public static void dfs(int v, int start) {
		if (v == M) {
			for (int i = 0; i < v; i++) {
				sb.append(res[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i < N; i++) {
			res[v] = arr[i];
			dfs(v + 1, i);
		}
	}
}
