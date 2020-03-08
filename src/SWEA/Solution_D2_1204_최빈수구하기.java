package SWEA;

import java.util.Scanner;

public class Solution_D2_1204_최빈수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int score[] = new int[101];

			for (int i = 0; i < 1000; i++) {
				int scr = sc.nextInt();
				score[scr]++;
			}
			int res = score[0];
			int idx = 0;
			for (int i = 0; i < 101; i++) {
				if (score[i] >= res) {
					res = score[i];
					idx = i;
				}
			}
			System.out.println("#" + tc + " " + idx);
		}
		sc.close();
	}
}
