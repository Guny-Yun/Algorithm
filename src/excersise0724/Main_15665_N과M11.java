package excersise0724;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_15665_N과M11 {
	static int N, M, res[];
	static StringBuilder sb = new StringBuilder();
	static Set<Integer> ts = new TreeSet<Integer>();
	static int[] num = new int[10001];
	static ArrayList<Integer> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		res = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			ts.add(tmp);
			num[tmp]++;
		}
		list = new ArrayList<>(ts);

		dfs(0);
		System.out.println(sb.toString());
	}

	public static void dfs(int v) {
		if (v == M) {
			for (int i = 0; i < v; i++) {
				sb.append(res[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			res[v] = list.get(i);
			dfs(v + 1);
		}
	}
}
