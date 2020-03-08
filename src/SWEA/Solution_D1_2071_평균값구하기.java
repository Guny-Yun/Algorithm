package SWEA;

import java.util.Scanner;

public class Solution_D1_2071_평균값구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T;tc++) {
			double[] arr = new double[10];
			double sum = 0;
			for(int i = 0; i<10; i++) {
				arr[i] = sc.nextDouble();
				sum = sum+ arr[i];
			}
			System.out.println("#" + tc + " " + Math.round(sum/10));
		}
	}

}
