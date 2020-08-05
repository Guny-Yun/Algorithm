package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1110_더하기사이클 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String tmp = N;
		int cnt = 0;
		while(true) {
			cnt++;
			if(N.length() < 2) {
				N = "0" + N;
			}
			int a = N.charAt(0) - '0';
			int b = N.charAt(1) - '0';
			String s = Integer.toString(a + b);
			N = Character.toString(N.charAt(N.length()-1)) + "" + Character.toString(s.charAt(s.length()-1));
			
			if(N.charAt(0) == '0') N = Character.toString(N.charAt(N.length()-1));
			
			if(tmp.equals(N))break;
		}
		System.out.println(cnt);
	}

}
