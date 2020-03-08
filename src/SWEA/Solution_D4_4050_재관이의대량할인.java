package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D4_4050_재관이의대량할인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] c = new int[N];

			for (int i = 0; i < N; i++) {
				c[i] = sc.nextInt();
			}
			Arrays.sort(c);
			int cnt = 1;
			int res = 0;
			for (int i = N - 1; i >= 0; i--) {
				if(cnt%3 == 0) {
					cnt++;
					continue;
				}
				res += c[i];
				cnt++;
			}
			System.out.println("#" + tc + " " + res);
		}
		sc.close();
	}
}
