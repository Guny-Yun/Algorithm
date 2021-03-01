package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9020_골드바흐의추측 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			for (a = N / 2, b = N / 2;; a++, b--) {
				N = a + b;
				if (erato(a) && erato(b)) {
					System.out.println(b + " " + a);
					break;
				}
			}
		}
	}

	public static boolean erato(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
