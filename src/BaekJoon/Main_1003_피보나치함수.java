package BaekJoon;

import java.util.Scanner;

public class Main_1003_피보나치함수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int n = sc.nextInt();
			int[]arr = new int[41];
			arr[0] = 0;
			arr[1] = 1;
			if(n == 0) {
				System.out.println(1 + " " + 0);
				continue;
			}
			for(int i = 2;i<=40;i++) {
				arr[i] = arr[i-1] + arr[i-2];
			}
			
			System.out.println(arr[n-1] + " " + arr[n]);
			
		}
		sc.close();
	}
}