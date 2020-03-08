package BaekJoon;

import java.util.Scanner;

public class Main_9663_NQueen {

	public static int N;
	public static int[] col;
	public static int result;

	public static boolean promising(int i) {
		for (int j = 0; j < i; j++) { // || 뒤에는 대각선
			if (col[j] == col[i] || Math.abs(col[j] - col[i]) == i - j)
				return false;
		}
		return true;
	}

	public static void nqueen(int i) {
		if (i == N) {
			result = result + 1;
		} else {
			for (int j = 0; j < N; j++) {
				col[i] = j;
				if (promising(i))
					nqueen(i + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		result = 0;
		N = sc.nextInt();
		col = new int[N];
		nqueen(0);
		System.out.println(result);
		sc.close();
	}

}