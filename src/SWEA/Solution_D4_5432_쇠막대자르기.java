package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D4_5432_쇠막대자르기 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T; tc++) {
			String in = br.readLine();
			int iron = 0;
			int res = 0;
			
			for(int i = 0; i<in.length();i++) {
				if(in.charAt(i) == '(' && in.charAt(i+1) == ')') {
					res += iron;
					i++;
				}
				else if(in.charAt(i) == '(')iron++;
				else if(in.charAt(i) == ')') {
					res++;
					iron--;
				}
			}
			System.out.println("#" + tc + " " + res);
		}
		br.close();
	}
}
