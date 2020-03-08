package SWEA;

import java.util.Scanner;

public class Solution_D3_3314_보충학습과평균 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<= T; tc++) {
			int sum = 0;
			for(int i = 0; i< 5;i++) {
				int a = sc.nextInt();
				if(a >= 40)sum+=a;
				else sum+=40;
			}
			
			System.out.println("#" + tc + " " + sum/5);
		}
		sc.close();
	}

}
