package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2140_지뢰찾기 {
	static int N;
	static int[][] map;
	static int[] di = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static int[] dj = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			char[] in = br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				map[i][j] = in[j] - 48;
			}
		}
		answer = 0;
		if (N == 3) {
			find(1, 1);
		} else if (N > 3) {
			for (int i = 1; i <= N - 2; i++) {
				for (int j = 1; j <= N - 2; j++) {
					find(i, j);
				}
			}
		}
		System.out.println(answer);
	}

	public static void find(int i, int j) {
		boolean flag = true;
		for (int k = 0; k < 8; k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			if (map[ni][nj] == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			answer++;
			for (int k = 0; k < 8; k++) {
				int ni = i + di[k];
				int nj = j + dj[k];
				if (map[ni][nj] > 0) {
					map[ni][nj]--;
				}
			}
		}
	}
}
