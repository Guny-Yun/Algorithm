package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_2504_괄호의값 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		boolean flag = false;
		long answer = 0;
		int cur = 1;
		Stack<Character> st = new Stack<>();
		for(int i = 0 ; i < in.length();i++) {
			char tmp = in.charAt(i);
			if(tmp == '(') {
				st.add(tmp);
				cur *= 2;
			}
			if(tmp == '[') {
				st.add(tmp);
				cur *= 3;
			}
			if(tmp == ')') {
				if(st.empty() || st.peek() != '(') {
					flag = true;
					break;
				}
				if(in.charAt(i-1) == '(') {
					answer += cur;
				}
				st.pop();
				cur /= 2;
			}else if(tmp == ']') {
				if(st.empty() || st.peek() != '[') {
					flag = true;
					break;
				}
				if(in.charAt(i-1) == '[') {
					answer += cur;
				}
				st.pop();
				cur /= 3;
			}
		}
		if(flag || !st.empty()) {
			System.out.println(0);
		}else {
			System.out.println(answer);
		}
		
	}
	

}
