package Level2;

import java.util.Stack;

public class Solution_올바른괄호 {
	static String s = "(())";
	public static void main(String[] args) {
		boolean answer = false;
		Stack<Character> st = new Stack<>();
		
		for(int i = 0 ; i < s.length();i++) {
			if(s.charAt(i) == '(')st.push(s.charAt(i));
			else {
				if(st.isEmpty()) {
					System.out.println(answer);
					return;
				}else if(st.pop() != '(') {
					System.out.println(answer);
					return;
				}
			}
		}
		if(st.isEmpty())answer = true;
		
		System.out.println(answer);
	}

}
