package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949_균형잡힌세상 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String in = br.readLine();
			if(in.equals("."))break;
			Stack<Character> st = new Stack<>();
			for (int i = 0; i < in.length(); i++) {
				if (in.charAt(i) == '.')
					break;
				else if (in.charAt(i) == '(' || in.charAt(i) == '[') {
					st.push(in.charAt(i));
				} else if (in.charAt(i) == ')') {
					if (!st.isEmpty() && st.peek() == '(')
						st.pop();
					else {
						st.add(in.charAt(i));
						break;
					}
				} else if (in.charAt(i) == ']') {
					if (!st.isEmpty() && st.peek() == '[')
						st.pop();
					else {
						st.add(in.charAt(i));
						break;
					}
				}
			}
			if (st.isEmpty()) {
				System.out.println("yes");
			} else
				System.out.println("no");
		}
	}
}
