package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2309_일곱난쟁이 {
	static int[] arr = new int[9];
	static int[] res = new int[7];
	static boolean find;
	static boolean[] visit = new boolean[9];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		dfs(0, 0);
		for (int a : res) {
			System.out.println(a);
		}
		sc.close();
	}

	public static void dfs(int sum, int cnt) {
		if (find)
			return;
		if (cnt == 7) {
			if (sum == 100) {
				int tmp = 0;
				for (int i = 0; i < 9; i++) {
					if (visit[i]) {
						res[tmp++] = arr[i];
						find = true;
					}
				}
			}
			return;
		}
		for (int i = 0; i < 9; i++) {
			if (visit[i])
				continue;
			visit[i] = true;
			dfs(sum + arr[i], cnt+1);
			visit[i] = false;

		}
	}

}
