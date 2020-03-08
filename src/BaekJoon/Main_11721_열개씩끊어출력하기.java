package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11721_열개씩끊어출력하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		
		int N = in.length();
		int n = N/10;
		for(int i = 0 ;i<n;i++) {
			for(int j = 0 ; j<10;j++) {
				System.out.print(in.charAt(j+i*10));
			}
			System.out.println();
		}
		for(int i = 10*n; i<in.length();i++) {
			System.out.print(in.charAt(i));
		}
		System.out.println();
	}
}
