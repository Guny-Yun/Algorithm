package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1977_완전제곱수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int min = (int)Math.ceil(Math.sqrt(M));
		int sum = 0;
		for(int i = 0; i <= Math.floor(Math.sqrt(N));i++) {
			sum += Math.pow(i , 2);
		}
		if(sum > 0) {
			System.out.println(sum);
			System.out.println((int)Math.pow(min,2));
		}else System.out.println(-1);
	}
}
