package SWEA;

import java.util.Scanner;

public class Solution_D2_1986_지그재그 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T;tc++) {
			int N = sc.nextInt();
			int sum;
			sum = 0;
			for(int i = N; N>0;N--) {
				if(N%2==0) sum -= N;
				else sum += N;
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
