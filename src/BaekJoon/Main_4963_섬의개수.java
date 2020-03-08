package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_4963_섬의개수 {
	static int[][] map;
	static boolean[][] visit;
	static int w, h, island;// 너비, 높이, 섬개수
	static int[] di = { -1, 1, 0, 0, -1, -1, 1, 1 };//8방향
	static int[] dj = { 0, 0, -1, 1, -1, 1, -1, 1 };

	public static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { i, j });
		visit[i][j] = true;
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			for (int k = 0; k < 8; k++) {
				int ni = curr[0] + di[k];
				int nj = curr[1] + dj[k];
				if (ni >= 0 && ni < h && nj >= 0 && nj < w && !visit[ni][nj] && map[ni][nj] == 1) {
					visit[ni][nj] = true;
					bfs(ni, nj);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if (w == 0 && h == 0)
				return;
			map = new int[h][w];
			visit = new boolean[h][w];
			island = 0;
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			} //세팅 끝
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !visit[i][j]) {
						bfs(i, j);
						island++;// 섬 개수++
					}
				}
			}
			System.out.println(island);
		}
	}
}
