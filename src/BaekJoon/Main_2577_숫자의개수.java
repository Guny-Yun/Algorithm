package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2577_숫자의개수 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine()); 
		int C = Integer.parseInt(br.readLine());
		int res = A*B*C;
		int[] num = {0,0,0,0,0,0,0,0,0,0};
		String abc = String.valueOf(res);
		for(int i = 0; i<abc.length();i++) {
			num[abc.charAt(i)-'0']++;
		}
		for(int a : num) {
			System.out.println(a);
		}
	}

}
