package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2578_빙고 {
	static int[][] map = new int[5][5];
	static int bingo() {
		int bingocnt = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int j = 0; j < 5; j++) {
				sum += map[i][j];
			}
			if (sum == -5) {
				bingocnt++;
				
			}
		} // 가로줄
		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int j = 0; j < 5; j++) {
				sum += map[j][i];
			}
			if (sum == -5)
				bingocnt++;
		} // 세로줄
		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += map[i][i];
		}
		if (sum == -5)
			bingocnt++;
		sum = 0;
		for (int i = 4; i >= 0; i--) {
			sum += map[i][4 - i];
		}
		if (sum == -5)
			bingocnt++;
		
		return bingocnt;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				int f = Integer.parseInt(st.nextToken());
				for (int m = 0; m < 5; m++) {
					for (int n = 0; n < 5; n++) {
						if (map[m][n] == f) {
							map[m][n] = -1;
							cnt++;
						}
					}
				}
				if (bingo()>=3) {
					System.out.println(cnt);
					return;
				}

			}
		}
	}
}