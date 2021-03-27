package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_16922_로마숫자만들기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[] chk = new boolean[50 * 20 + 1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N - i; j++) {
				for (int k = 0; k <= N - i - j; k++) {
					int tmp = N - i - j - k;
					int num = i + 5 * j + 10 * k + 50 * tmp;
					chk[num] = true;
				}
			}
		}
		int answer = 0;
		for (int i = 1; i < 50 * 20 + 1; i++) {
			if (chk[i])
				answer++;
		}
		System.out.println(answer);
	}

}
