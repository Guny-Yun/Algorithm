package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3187_양치기꿍 {
	static char[][] map;
	static int r, c, sheep, wolf, tmp_s, tmp_w;
	static boolean[][] visit;
	static int[] di = { -1, 1, 0, 0 };
	static int[] dj = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new char[r][c];
		visit = new boolean[r][c];
		for (int i = 0; i < r; i++) {
			map[i] = br.readLine().toCharArray();
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (map[i][j] != '#' && !visit[i][j]) {
					tmp_s = 0;
					tmp_w = 0;
					dfs(i, j);

					if (tmp_s > tmp_w) {
						tmp_w = 0;
					} else {
						tmp_s = 0;
					}
					sheep += tmp_s;
					wolf += tmp_w;
				}
			}
		}
		System.out.println(sheep + " " + wolf);

	}

	public static void dfs(int i, int j) {
		visit[i][j] = true;
		if (map[i][j] == 'k')
			tmp_s++;
		else if (map[i][j] == 'v')
			tmp_w++;

		for (int k = 0; k < 4; k++) {
			int ni = i + di[k];
			int nj = j + dj[k];

			if (ni >= 0 && nj >= 0 && ni < r && nj < c && !visit[ni][nj] && map[ni][nj] != '#') {
				dfs(ni, nj);
			}
		}
	}

}
