package Level2;

import java.util.Arrays;

public class Solution_N개의최소공배수 {
	static int[] arr = { 2, 6, 8, 14 };

	public static void main(String[] args) {
		Arrays.sort(arr);
		int answer = arr[0];

		for (int i = 1; i < arr.length; i++) {
			answer = lcm(answer, arr[i]);
		}
		System.out.println(answer);
	}

	public static int gcd(int a, int b) {
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return (int) a * b / gcd(a, b);
	}
}
