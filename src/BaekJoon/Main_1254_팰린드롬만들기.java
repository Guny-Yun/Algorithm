package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1254_팰린드롬만들기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String rev = new StringBuilder(s).reverse().toString();
		int answer = 0;
		
		if(s.equals(rev)) {
			answer = s.length();
		}else {
			for(int i = 1; i < s.length();i++) {
				StringBuilder sb = new StringBuilder(s);
				sb.append(new StringBuilder(s.substring(0,i)).reverse());
				
				if(sb.toString().equals(sb.reverse().toString())) {
					answer = sb.length();
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
