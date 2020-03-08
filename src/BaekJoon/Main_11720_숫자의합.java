package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11720_숫자의합{
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String in = br.readLine();
		int sum = 0;
		for(int i = 0; i<N;i++) {
			sum += in.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
