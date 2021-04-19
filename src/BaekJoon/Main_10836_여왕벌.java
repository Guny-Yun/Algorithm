package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10836_여왕벌 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[][] map = new int[M][M];
		for (int i = 0; i < M; i++)
			Arrays.fill(map[i], 1);

		for (int k = 0; k < N; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			int z = Integer.parseInt(st.nextToken());
			int o = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());

			for (int i = M - 1; i > 0; i--) {
				if (z != 0)
					z--;
				else if (o != 0) {
					o--;
					map[i][0] += 1;
				} else if (t != 0) {
					t--;
					map[i][0] += 2;
				}
			}
			for (int i = 0; i < M; i++) {
				if (z != 0)
					z--;
				else if (o != 0) {
					o--;
					map[0][i] += 1;
				} else if (t != 0) {
					t--;
					map[0][i] += 2;
				}
			}
		}
		for (int r = 1; r < M; r++) {
			for (int c = 1; c < M; c++) {
				map[r][c] = (map[r - 1][c] > map[r][c - 1])
						? ((map[r - 1][c] > map[r - 1][c - 1]) ? map[r - 1][c] : map[r - 1][c - 1])
						: ((map[r][c - 1] > map[r - 1][c - 1]) ? map[r][c - 1] : map[r - 1][c - 1]);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(map[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
