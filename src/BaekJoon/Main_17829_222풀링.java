package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_17829_222풀링 {
	static int[][] map = new int[1025][1025];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dc(N);

		System.out.println(map[0][0]);
	}

	public static void dc(int n) {
		if (n == 1)
			return;

		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < n; j += 2) {
				int[] tmp = { map[i][j], map[i][j + 1], map[i + 1][j], map[i + 1][j + 1] };
				Arrays.parallelSort(tmp);
				map[i / 2][j / 2] = tmp[2];
			}
		}
		dc(n/2);
	}
}
