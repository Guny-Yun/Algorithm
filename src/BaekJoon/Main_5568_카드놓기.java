package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_5568_카드놓기 {
	public static HashSet<String> hs = new HashSet<>();
	public static boolean[] visited;
	public static String[] card;
	public static int n, k;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		card = new String[n + 1];
		visited = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			card[i] = br.readLine();
		}
		dfs(k, 1, "");
		System.out.println(hs.size());
	}

	public static void dfs(int k, int idx, String s) {
		if (k == 0) {
			hs.add(s);
			return;
		}
		if (idx > n) {
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(k - 1, i, s + card[i]);
				visited[i] = false;
			}
		}
	}
}