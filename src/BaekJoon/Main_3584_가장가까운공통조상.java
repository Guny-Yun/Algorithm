package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_3584_가장가까운공통조상 {
	/*
	 * https://dev-splin.github.io/coding%20test/baekjoon/BaekJoon-Java-BaekJoon-
	 * LowestCommonAncestor-3584/
	 */
	static final int MAX_NODE = 10001;
	static final int MAX_LEVEL = 14;
	static int N;
	static int[] level;
	static int[][] parents;
	static ArrayList<Integer>[] adj;
	static int[] parentNode;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			level = new int[N + 1];
			parents = new int[N + 1][MAX_LEVEL + 1];
			adj = new ArrayList[N + 1];
			parentNode = new int[N + 1];
			for (int i = 1; i <= N; i++)
				adj[i] = new ArrayList<>();
			// setting

			for (int i = 1; i <= N; i++) {
				String nodes = br.readLine();
				st = new StringTokenizer(nodes);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if (i == N) {
					setParent();
					sb.append(LCA(a, b) + "\n");
					break;
				}
				adj[a].add(b);
				adj[b].add(a);
				parentNode[b] = a;
			}

		} // TC
		System.out.println(sb);
	}

	public static void setParent() {
		int startNode = 0;
		for (int i = 1; i <= N; i++) {
			if (parentNode[i] == 0)
				startNode = i;
		}
		dfs(startNode, 1);

		for (int i = 1; i <= MAX_LEVEL; i++) {
			for (int j = 1; j <= N; j++) {
				parents[j][i] = parents[parents[j][i - 1]][i - 1];
			}
		}
	}

	public static void dfs(int node, int depth) {
		level[node] = depth;
		for (int adjNode : adj[node]) {
			if (level[adjNode] != 0)
				continue;

			parents[adjNode][0] = node;
			dfs(adjNode, depth + 1);
		}
	}

	public static int LCA(int a, int b) {
		if (level[a] > level[b]) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		for (int i = MAX_LEVEL; i >= 0; i--) {
			if (level[a] <= level[parents[b][i]])
				b = parents[b][i];
		}
		if (b == a)
			return a;
		else {
			for (int i = MAX_LEVEL; i >= 0; i--) {
				if (parents[a][i] != parents[b][i]) {
					a = parents[a][i];
					b = parents[b][i];
				}
			}
			return parents[a][0];
		}
	}
}
