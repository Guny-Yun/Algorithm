package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_2805_농작물수확하기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int sum = 0;
			int cnt = 1;
			int N = Integer.parseInt(br.readLine());
			String[] farm = new String[N];

			for (int i = 0; i < N; i++) {
				farm[i] = br.readLine();
			}//입력끝
			for (int i = 0; i < N; i++) {
				if ((N / 2 - i) >= 0) {
					for (int j = N / 2 - i; j <= N / 2 + i; j++) {
						sum = sum + farm[i].charAt(j) - '0';
					}
				} else if ((N / 2 - i) < 0) {
					for (int j = cnt; j < N-cnt; j++) {
						sum = sum + farm[i].charAt(j) - '0';
					}
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
