package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_8394_악수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int a = 1;
		int b = 1;
		if(n <= 1)System.out.println(1);
		else {
			for(int i = 2; i<= n;i++) {
				int tmp = a;
				a = (a + b) % 10;
				b = tmp;
			}
			
			System.out.println(a);
		}
	}
}
