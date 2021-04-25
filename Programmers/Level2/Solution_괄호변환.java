package Level2;

import java.util.Stack;

public class Solution_괄호변환 {
	static int pos;

	static String p = "(()())()";

	public static void main(String[] args) {
		System.out.println(solution(p));
	}

	public static String solution(String p) {

		if (p.isEmpty())
			return p;

		boolean cor = isCorrect(p);

		String u = p.substring(0, pos);
		String v = p.substring(pos, p.length());

		if (cor) {
			return u + solution(v);
		}
		String answer = "(" + solution(v) + ")";

		for (int i = 1; i < u.length() - 1; i++) {
			if (u.charAt(i) == '(')
				answer += ")";
			else
				answer += "(";
		}
		return answer;
	}

	public static boolean isCorrect(String str) {

		boolean ret = true;
		int left = 0, right = 0;
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				left++;
				st.push('(');
			} else {
				right++;
				if (st.empty()) {
					ret = false;
				} else
					st.pop();
			}
			if (left == right) {
				pos = i + 1;
				return ret;
			}
		}
		return true;
	}

}
