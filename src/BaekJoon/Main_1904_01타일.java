package BaekJoon;

import java.util.Scanner;

public class Main_1904_01타일 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long a = 0;
		long b = 1;
		long c = a+b;
		for(int i = 2 ; i<=n;i++) {
			a = b;
			b = c;
			c = a+b;
			c%=15746;
		}
		sc.close();
		if(n ==0) {
			System.out.println(0);
			return;
		}
		System.out.println(c);
	}
}
