package SWEA;

import java.util.Scanner;

public class Solution_D3_6958_동철이의프로그래밍대회 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int maxcnt = 0;
			int people = 0;
			for (int i = 0; i < N; i++) {

				int cnt = 0;
				for (int j = 0; j < M; j++) {
					if (sc.nextInt() == 1)
						cnt++;
				}
				if (cnt > maxcnt) {
					maxcnt = cnt;
					people = 1;
				} else if (cnt == maxcnt)
					people++;
			}

			System.out.println("#" + tc + " " + people + " " + maxcnt);
		}
		sc.close();
	}

}
