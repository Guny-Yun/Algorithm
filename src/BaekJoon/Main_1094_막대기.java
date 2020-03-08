package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1094_막대기 {
	static int[] stick = { 64, 32, 16, 8, 4, 2, 1 };
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		for (int i = 0; i < stick.length; i++) {
			if (stick[i] == N) {
				System.out.println(cnt);
				;
				return;
			} else if (stick[i] < N) {
				N -= stick[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
