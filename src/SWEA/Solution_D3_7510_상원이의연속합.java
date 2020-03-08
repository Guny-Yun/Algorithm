package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_7510_상원이의연속합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			int cnt = 0;

			for (int i = 1; i <= N; i++) {
				sum = 0;
				int idx = i;
				while (true) {
					sum += idx;
					if (sum == N) {
						cnt++;
						break;
					}
					else if(sum>N){
						break;
					}
					idx++;
				}
			}
			System.out.println("#"+tc+" " + cnt);
		}
	}
}
