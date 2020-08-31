package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_17070_파이프옮기기1 {
	static int N, cnt;
	static int[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		map = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		cnt = 0;
		dfs(1, 2, 0);
		System.out.println(cnt);
	}

	public static void dfs(int i, int j, int dir) {
		if (i == N && j == N) {
			cnt++;
			return;
		}

		if (isRange(i, j + 1) && map[i][j + 1] == 0 && dir != 2) {
			dfs(i, j + 1, 0);
		}

		if (isRange(i + 1, j) && map[i + 1][j] == 0 && dir != 0) {
			dfs(i + 1, j, 2);
		}

		if (isRange(i + 1, j + 1) && map[i + 1][j] == 0 && map[i][j + 1] == 0 && map[i + 1][j + 1] == 0) {
			dfs(i + 1, j + 1, 1);
		}
	}

	public static boolean isRange(int i, int j) {
		if (i <= 0 || j <= 0 || i > N || j > N)
			return false;
		else
			return true;
	}

}
