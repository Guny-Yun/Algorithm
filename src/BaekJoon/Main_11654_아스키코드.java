package BaekJoon;

import java.util.Scanner;

public class Main_11654_아스키코드{
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(a.charAt(0)-'0' + 48);
		sc.close();
	}

}
