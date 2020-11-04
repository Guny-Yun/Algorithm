package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2292_벌집 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N == 1)
			System.out.println(1);
		else {
			int cnt = 1;
			int k = 2;
			while (k <= N) {
				k += 6 * cnt++;
			}
			System.out.println(cnt);
		}
	}
}
