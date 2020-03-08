package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_3750_Digitsum {
	public static String digitsum(String s) {
		String res = s;
		if(s.length() == 1) return s;
		int sum = 0;
		for(int i = 0; i<s.length();i++) {
			sum += (s.charAt(i)-'0');
			res = sum+"";
		}
		return digitsum(res);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc= 1;tc<=T;tc++) {
			String t = br.readLine();
			System.out.println("#" + tc + " " + digitsum(t));
		}
	}
}
