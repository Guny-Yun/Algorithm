package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1918_후위표기식 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> s = new Stack<>();
		
		String in = br.readLine();
		for(int i = 0 ; i < in.length();i++) {
			int tmp = (int)in.charAt(i);
			
			if(tmp >= 65 && tmp <= 90) {
				sb.append(in.charAt(i));
			}else if(in.charAt(i) == '*' || in.charAt(i)=='/') {
				while(!s.empty() && (s.peek()=='*' || s.peek() == '/')) {
					sb.append(s.pop());
				}
				s.push(in.charAt(i));
			}else if(in.charAt(i) == '+' || in.charAt(i) == '-') {
				while(!s.empty() && (s.peek() == '*' || s.peek() == '/' || s.peek() == '+' || s.peek() == '-')) {
					sb.append(s.pop());
				}
				s.push(in.charAt(i));
			}else if(in.charAt(i) == '(') {
				s.push(in.charAt(i));
			}else if(in.charAt(i) == ')') {
				while(s.peek() != '(') {
					sb.append(s.pop());
				}
				s.pop();
			}
		}
		while(!s.empty())sb.append(s.pop());
		System.out.println(sb.toString());
	}
}
