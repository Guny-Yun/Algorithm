package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_D9_2105_디저트카페 {
	static int[][] map;
	static int[] di = { 1, 1, -1, -1 };
	static int[] dj = { 1, -1, -1, 1 };
	static int N, maxcnt, curdir, start_i, start_j;
	static Stack<Integer> list;
	public static void dfs(int i, int j) {
		list.push(map[i][j]);
		for (int k = curdir; k < 4; k++) {
			curdir = k;
			int ni = i + di[k];
			int nj = j + dj[k];
			if (ni >= 0 && ni < N && nj >= 0 && nj < N ) {
				if(!list.contains(map[ni][nj])) {
					dfs(ni, nj);
					list.pop();
				}
				else {
					if (start_i == ni && start_j == nj && list.size() >= 4) {
						maxcnt = Math.max(maxcnt, list.size());
					}
				}
			} 
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			maxcnt = -1;
			for (int i = 0; i < N - 2; i++) {
				for (int j = 1; j < N - 1; j++) {
					list = new Stack<Integer>();
					curdir = 0;
					start_i = i;
					start_j = j;
					dfs(i, j);
				}
			}
			System.out.println("#" + tc + " " + maxcnt);
		} // end tc
	}
}