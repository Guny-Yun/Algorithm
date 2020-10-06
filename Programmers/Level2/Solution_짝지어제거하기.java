package Level2;

import java.util.*;

public class Solution_짝지어제거하기 {
	static String s = "cdcd";

	public static void main(String[] args) {
		int answer = 0;
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			
			if (st.isEmpty())
				st.add(tmp);
			else if (st.peek() == tmp) {
				st.pop();
			} else
				st.add(tmp);
		}
		if (st.isEmpty())
			answer = 1;
		else
			answer = 0;
		System.out.println(answer);
	}

}
