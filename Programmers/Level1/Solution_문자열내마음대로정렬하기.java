package Level1;

import java.util.*;

public class Solution_문자열내마음대로정렬하기 {
	static String[] strings = {"abce", "abcd", "cdx"};
	static int n;
	public static void main(String[] args) {
		
		Arrays.sort(strings, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				char c1 = s1.charAt(n);
				char c2 = s2.charAt(n);
				
				if(c1 == c2) {
					return s1.compareTo(s2);
				}
				else return c1-c2;
			}
		});
		for(String s : strings)System.out.print(s + " ");
		
	}

}
