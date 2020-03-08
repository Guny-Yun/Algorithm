package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_8958_OX퀴즈{

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T; tc++) {
			String input = br.readLine();
			int cnt = 0;
			int sum = 0;
			for(int i = 0; i< input.length();i++) {
				if(input.charAt(i) == 'O') {
					cnt++;
					sum+= cnt;
				}
				else cnt = 0;
			}
			System.out.println(sum);
		}
	}
}
