package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1992_쿼드트리 {
	public static int[][] map;
	public static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			String in = br.readLine();
			for (int j = 0; j < N; j++)
				map[i][j] = in.charAt(j) - '0';
		}
		divcon(0, 0, N);
	}
	public static boolean chk(int i, int j, int n) {
		int first = map[i][j];
		for (int r = i; r < i + n; r++) {
			for (int c = j; c < j + n; c++) {
				if (first != map[r][c]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void divcon(int i, int j, int n) {
		if (chk(i, j, n)) {
			System.out.print(map[i][j]);
			return;
		}
		System.out.print("(");
		n = n / 2;
		divcon(i, j, n);
		divcon(i, j + n, n);
		divcon(i + n, j, n);
		divcon(i + n, j + n, n);
		System.out.print(")");
	}
}