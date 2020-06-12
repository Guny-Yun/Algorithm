package Level1;

import java.util.*;

public class Solution_정수내림차순으로배치하기 {
	static long n = 118372;
	public static void main(String[] args) {
		long answer = 0;
		String[] temp = (""+n).split("");
		Arrays.sort(temp,Collections.reverseOrder());
		
		answer = Long.parseLong(String.join("", temp));
		
		System.out.println(answer);
		
	}

}
