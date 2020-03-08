package SWEA;

import java.util.Scanner;
public class Solution_D1_2050_알파벳을숫자로변환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alpha;
		alpha = sc.next();
		for(int i = 0; i< alpha.length();i++) {
			System.out.print(alpha.charAt(i) - 64 + " ");
		}
	}

}
