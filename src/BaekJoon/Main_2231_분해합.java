package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2231_분해합 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int n = Integer.parseInt(N);
		for(int i = 1;i<n;i++) {
			if(n == sol(String.valueOf(i))) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
	public static int sol(String num) {
		int sum = Integer.parseInt(num);
		for(int i = 0; i<num.length();i++) {
			sum += num.charAt(i)-'0';
		}
		return sum;
	}

}
