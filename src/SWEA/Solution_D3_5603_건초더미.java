package SWEA;

import java.util.Scanner;

public class Solution_D3_5603_건초더미 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T;tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int move = 0,sum = 0;
			for(int i = 0; i<N;i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			int avg = sum/N;
			
			go:for(int i = 0;i<N;i++) {
				int gap = avg-arr[i];
				if(gap < 1) continue go;
				move += gap;
			}
			System.out.println("#" + tc + " " + move);
		}
		sc.close();
	}
}
