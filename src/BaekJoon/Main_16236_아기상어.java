package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_16236_아기상어 {
	static int N, time, shark_i, shark_j, min_dist, min_i, min_j, shark_size = 2, eat_cnt = 0;
	static int[][] map, check;
	static int[] di = { -1, 1, 0, 0 };
	static int[] dj = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		time = 0; // 시간
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		check = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 9) {
					map[i][j] = 0;
					shark_i = i;
					shark_j = j;
				} // 아기 상어 좌표
			}
		} // 입력 끝

		while (true) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					check[i][j] = -1;
				}
			}
			min_dist = Integer.MAX_VALUE;
			min_i = Integer.MAX_VALUE;
			min_j = Integer.MAX_VALUE;

			bfs(shark_i, shark_j);

			if (min_i != Integer.MAX_VALUE && min_j != Integer.MAX_VALUE) {
				time += check[min_i][min_j];
				eat_cnt++;

				if (eat_cnt == shark_size) {
					shark_size++;
					eat_cnt = 0;
				}
				map[min_i][min_j] = 0;
				shark_i = min_i;
				shark_j = min_j;
			} else {
				break;
			}
		}

		System.out.println(time);
	}

	public static void bfs(int i, int j) {
		Queue<Position> que = new LinkedList<>();
		check[i][j] = 0;
		que.add(new Position(i, j));

		while (!que.isEmpty()) {
			Position cur = que.poll();
			i = cur.i;
			j = cur.j;

			for (int k = 0; k < 4; k++) {
				int ni = i + di[k];
				int nj = j + dj[k];

				if (ni < 0 || ni >= N || nj < 0 || nj >= N)
					continue;
				if (check[ni][nj] != -1 || map[ni][nj] > shark_size)
					continue;

				check[ni][nj] = check[i][j] + 1;

				if (map[ni][nj] != 0 && map[ni][nj] < shark_size) {
					if (min_dist > check[ni][nj]) {
						min_i = ni;
						min_j = nj;
						min_dist = check[ni][nj];
					} else if (min_dist == check[ni][nj]) {
						if (min_i == ni) {
							if (min_j > nj) {
								min_i = ni;
								min_j = nj;
							}
						} else if (min_i > ni) {
							min_i = ni;
							min_j = nj;
						}
					}
				}
				que.add(new Position(ni, nj));

			}
		}

	}

}

class Position {
	int i, j;

	Position(int i, int j) {
		this.i = i;
		this.j = j;
	}
}
