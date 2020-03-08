package BaekJoon;

import java.util.Scanner;

public class Main_5532_방학숙제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int t1 = (A+C-1)/C;
		int t2 = (B+D-1)/D;
		int res = L-Math.max(t1, t2);
		System.out.println(res);
	}
}
