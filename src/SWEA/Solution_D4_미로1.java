package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D4_미로1 {
	private static int[][] map;
	private static boolean[][] visited;
	private static int N = 16, res,ni,nj;
	private static final int[] di = { -1, 0, 1, 0 };
	private static final int[] dj = { 0, 1, 0, -1 };

	private static void dfs(int i, int j) {// dfs
		visited[i][j] = true;
		for (int k = 0; k <4; k++) {
			ni = i + di[k];
			nj = j + dj[k];
			if(map[ni][nj] == 3) {
				res = 1;
				return;
			}
			if (0 <= ni && 0 <= nj && ni < N && nj < N ) {
				if(map[ni][nj] == 0 && !visited[ni][nj])dfs(ni, nj);
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			br.readLine();
			map = new int[N][N];
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				String in = br.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j] = in.charAt(j) - '0';
				}
			} ///// 입력 끝
			res = 0;
			dfs(1,1);
			System.out.println("#" + tc + " " + res);
		}
	}
}