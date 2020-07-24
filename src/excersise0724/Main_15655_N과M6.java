package excersise0724;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15655_N과M6 {
	static int N, M, res[], arr[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		res = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		dfs(0, 0);
	}

	public static void dfs(int v, int start) {
		if (v == M) {
			for (int i = 0; i < v; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i < N; i++) {
			res[v] = arr[i];
			dfs(v + 1, i + 1);
		}
	}

}
