package BaekJoon;

import java.util.Scanner;

public class Main_2609_최대공약수와최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long gcd = gcd(Math.max(a,b) , Math.min(a,b));
		long lcm = lcm(a,b,gcd);
		
		System.out.println(gcd);
		System.out.println(lcm);
		sc.close();
	}
	public static long gcd(long a, long b) {
		while(b > 0) {
			long tmp = a;
			a= b;
			b= tmp%b;
		}
		return a;
	}
	public static long lcm(long a, long b,long gcd) {
		return (a*b)/gcd;
	}

}
