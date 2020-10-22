package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2810_컵홀더 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String in = br.readLine();
		String s = in;
		s = s.replaceAll("S", "*S*");
		s = s.replaceAll("LL", "*LL*");
		s = s.replaceAll("\\*\\*", "*");
		
		int cnt = 0;
		
		for(int i = 0 ; i < s.length();i++) {
			if(s.charAt(i) == '*')cnt++;
		}
		if(in.length() < cnt) {
			System.out.println(N);
		}else {
			System.out.println(cnt);
		}
	}
}
