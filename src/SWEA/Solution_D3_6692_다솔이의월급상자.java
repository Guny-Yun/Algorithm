package SWEA;

import java.util.Scanner;

public class Solution_D3_6692_다솔이의월급상자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T;tc++) {
			int N = sc.nextInt();
			double sum = 0;
			for(int i = 0; i<N;i++) {
				double a = sc.nextDouble();
				int b = sc.nextInt();
				sum+= a*b;
			}
			System.out.printf("#" + tc + " %.6f",sum);
		}
		sc.close();
	}

}
