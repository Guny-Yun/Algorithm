package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012_괄호 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		here:for (int tc = 1; tc <= N; tc++) {
			char[] in = br.readLine().toCharArray();
			if (in[0] == ')') {
				System.out.println("NO");
				continue;
			}
			Stack<Character> st = new Stack<>();

			for (int i = 0; i < in.length; i++) {

				char ch = in[i];

				if (ch == '(')
					st.push(ch);
				else if (ch == ')') {
					if (st.isEmpty()) {
						System.out.println("NO");
						continue here;
					} else {
						st.pop();
					}
				}
			}
			if (st.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
