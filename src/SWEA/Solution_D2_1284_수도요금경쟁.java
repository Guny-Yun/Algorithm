package SWEA;

import java.util.Scanner;

public class Solution_D2_1284_수도요금경쟁 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = T; tc<=T;tc++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			
			int A = W * P;
			int B;
			int min = Integer.MAX_VALUE;
			if( W <= R) B = Q;
			else B = (W-R)*S + Q;
			if(A<B)min = A;
			else min = B;
			System.out.println("#" + tc + " " + min);
		}
	}
}
