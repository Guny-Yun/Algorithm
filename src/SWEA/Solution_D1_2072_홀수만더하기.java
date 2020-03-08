package SWEA;

import java.util.Scanner;

public class Solution_D1_2072_홀수만더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int k;
		int sum = 0;
		for(int tc = 1; tc<= T;tc++) {
			int[] arr = new int[10];
			for(int i = 0; i< 10;i++) {
				arr[i] = sc.nextInt();
				if(arr[i] %2 != 0)sum = sum + arr[i];
			}
			System.out.println("#" + tc + " " + sum);
			sum = 0; 
		}
	}

}
