package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5607_조합 {
	static long N, R;
	static long mod = 1234567891;

	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Long.parseLong(st.nextToken());
			R = Long.parseLong(st.nextToken());
			long A=1; long B=1;
			
			for(long i = N;i>N-R;i--) {
				A *= i;
				A %= mod;
			}
			for(int i = 1;i<=R;i++) {
				B *= i;
				B %= mod;
			}
			
			
		} // end tc
	}
}
