package Level1;

import java.util.*;
public class Solution_문자열내림차순으로배치하기 {
	
	static String s = "Zbcdefg";
	public static void main(String[] args) {
		String answer = "";
		
		char[] tmp = s.toCharArray();
		Arrays.sort(tmp);
		
		answer += new StringBuilder(new String(tmp)).reverse().toString();
		
		System.out.println(answer);
	}
}
