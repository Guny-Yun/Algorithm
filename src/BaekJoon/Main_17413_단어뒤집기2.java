package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_17413_단어뒤집기2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> s = new Stack<Character>();
		String in = br.readLine();
		boolean flag = false;
		
		for(char c : in.toCharArray()) {
			if(c == '<') {
				flag = true;
				while(!s.isEmpty()) {
					sb.append(s.pop());
				}
				sb.append("<");
			}else if(c == '>') {
				flag = false;
				sb.append(">");
			}else if(c == ' ') {
				while(!s.isEmpty()) {
					sb.append(s.pop());
				}
				sb.append(" ");
			}else {
				if(!flag) s.push(c);
				else sb.append(c);
			}
		}
		while(!s.isEmpty()) {
			sb.append(s.pop());
		}
		System.out.println(sb);
		
	}

}
