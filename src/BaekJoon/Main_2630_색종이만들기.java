package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2630_색종이만들기 {
	static int white;
	static int blue;
	static int[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		paper(0, 0, N, N);
		System.out.println(white);
		System.out.println(blue);
	}

	public static void paper(int r, int c, int R, int C) {
		int sum = 0;
		for (int i = r; i < R; i++) {
			for (int j = c; j < C; j++) {
				sum += map[i][j];
			}
		}
		if (sum == 0) {
			white++;
			return;
		} else if (sum == (C - c) * (R - r)) {
			blue++;
			return;
		} else {
			paper(r, c, (R + r) / 2, (C + c) / 2);
			paper((R + r) / 2, c, R, (C + c) / 2);
			paper(r, (C + c) / 2, (R + r) / 2, C);
			paper((R + r) / 2, (C + c) / 2, R, C);
		}
	}
}
