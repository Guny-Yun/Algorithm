package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main_5397_키로거 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			String in = br.readLine();
			Deque<Character> pre = new ArrayDeque<Character>();
			Deque<Character> post = new ArrayDeque<Character>();

			for (int i = 0; i < in.length(); i++) {
				char tmp = in.charAt(i);

				switch (tmp) {
				case '<':
					if (!pre.isEmpty()) {
						post.addFirst(pre.pollLast());
					}
					break;
				case '>':
					if (!post.isEmpty()) {
						pre.addLast(post.pollFirst());
					}
					break;
				case '-':
					if (!pre.isEmpty()) {
						pre.pollLast();
					}
					break;
				default:
					pre.add(tmp);
				}
			}
			while(!pre.isEmpty()) {
				sb.append(pre.pollFirst());
			}
			while(!post.isEmpty()) {
				sb.append(post.pollFirst());
			}

			sb.append("\n");
		}
		System.out.println(sb);

	}

}
