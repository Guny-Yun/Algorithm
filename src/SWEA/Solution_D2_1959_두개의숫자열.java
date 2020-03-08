package SWEA;

import java.util.Scanner;

public class Solution_D2_1959_두개의숫자열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[M];
			for (int i = 0; i < N; i++)
				A[i] = sc.nextInt();
			for (int i = 0; i < M; i++)
				B[i] = sc.nextInt();
			// 세팅
			int max = Integer.MIN_VALUE;
			if (N < M) {
				for (int i = 0; i < M - N + 1; i++) {
					int sum = 0;
					for (int j = i; j - i < N; j++) {
						sum += B[j] * A[j - i];
					}
					max = Math.max(max, sum);
				}
			} else {
				for (int i = 0; i < N - M + 1; i++) {
					int sum = 0;
					for (int j = i; j - i < M; j++) {
						sum += A[j] * B[j - i];
					}
					max = Math.max(max, sum);

				}
			}
			
			System.out.println("#" + tc + " " + max);
		}

	}

}
