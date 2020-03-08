package SWEA;

import java.util.Scanner;

public class Solution_D2_1989_초심자의회문검사 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			String s = sc.next();
			StringBuilder sb = new StringBuilder(s);
			if(sb.reverse().toString().equals(s)) {
				System.out.println("#" + tc + " " + "1");
			}else 
				System.out.println("#" + tc + " " + "0");
			
			
		}
	}

}
