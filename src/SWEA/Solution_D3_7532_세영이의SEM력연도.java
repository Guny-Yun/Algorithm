package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7532_세영이의SEM력연도 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if (S == 365)S = 0;
			if (E == 24)E = 0;
			if (M == 29)M = 0;
			
			int res = 1;
			for(;;) {
				if (res % 365 == S && res % 24 == E && res % 29 == M)break;
				res++;
			}
			System.out.println("#" + tc + " " + res);
		}
	}
}
