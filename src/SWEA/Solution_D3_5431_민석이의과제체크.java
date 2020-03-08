package SWEA;

import java.util.Scanner;

public class Solution_D3_5431_민석이의과제체크 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1;tc<=T;tc++) {
			int N =sc.nextInt();
			int K = sc.nextInt();
			int[] su = new int[N+1];
			for(int i = 0;i<K;i++) {
				int n = sc.nextInt();
				su[n]++;
			}
			System.out.print("#"+ tc + " ");
			for(int i = 1; i<N+1;i++) {
				if(su[i] == 0)System.out.print(i + " ");
			}
			System.out.println();
			
		}
		sc.close();
	}

}
