package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11586_지영공주님의마법거울 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char[][] map = new char[N][N];

		for (int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		int mind = Integer.parseInt(br.readLine());

		if (mind == 1) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
		} else if (mind == 2) {
			for (int i = 0; i < N; i++) {
				for (int j = N - 1; j >= 0; j--) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
		} else if (mind == 3) {
			for (int i = N - 1; i >= 0; i--) {
				for (int j = 0; j < N; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
