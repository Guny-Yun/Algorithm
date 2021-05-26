package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1788_피보나치수의확장 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int one = 0;
		int two = 0;
		int thr = 1;
		if(Math.abs(N) <= 1) {
			System.out.println(Math.abs(N));
			System.out.println(Math.abs(N));
			return;
		}
		
		boolean m = false;
		if(N < 0)m = true;
		N = Math.abs(N);
		
		for(int i =2 ; i<= N;i++) {
			one = two;
			two = thr;
			thr = (one + two) % 1000000000;
		}
		if(m && N%2 ==0 )System.out.println(-1);
		else System.out.println(1);
		System.out.println(thr);
	}

}
