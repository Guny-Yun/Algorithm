package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9935_문자열폭발 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] target = br.readLine().toCharArray();
		char[] bomb = br.readLine().toCharArray();
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < target.length; i++) {
			st.push(target[i]);
			boolean flag = false;

			if (st.peek() == bomb[bomb.length - 1] && st.size() >= bomb.length) {
				for (int j = 0; j < bomb.length; j++) {
					if (bomb[bomb.length - 1 - j] == st.get(st.size() - 1 - j))
						flag = true;
					else {
						flag = false;
						break;
					}
				}
				if (flag) {
					for (int j = 0; j < bomb.length; j++) {
						st.pop();
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder("");
		if (st.isEmpty())
			System.out.println("FRULA");
		else {
			for (int i = 0; i < st.size(); i++) {
				sb.append(st.get(i));
			}
		}
		System.out.println(sb.toString());
		st.clear();

	}

}
