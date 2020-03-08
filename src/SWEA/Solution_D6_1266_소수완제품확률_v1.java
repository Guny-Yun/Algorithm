package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D6_1266_소수완제품확률_v1 {
	public static final int[] arr = {0,1,4,6,8,9,10,12,14,15,16,18};

	private static double nCr(int n, int r) {
		if(r==0)return 1.0;
		return 1.0*n/r*nCr(n-1,r-1);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double A = Double.parseDouble(st.nextToken())/100;
			double B = Double.parseDouble(st.nextToken())/100;
			double resA=0,resB=0;
			for(int i = 0; i< arr.length;i++) {
				resA += nCr(18,arr[i])*Math.pow(A,arr[i])*Math.pow(1-A, 18-arr[i]);
				resB += nCr(18,arr[i])*Math.pow(B,arr[i])*Math.pow(1-B, 18-arr[i]);
			}
			double res = 1 - (resA * resB);
			System.out.printf("#%d %.6f\n",tc, res);
		}
	}
}