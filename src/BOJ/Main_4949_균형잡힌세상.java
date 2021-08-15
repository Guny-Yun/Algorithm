package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949_균형잡힌세상 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String in = br.readLine();
			if(in.equals(".")) {
				break;
			}
			sb.append(isBal(in));
		}
		System.out.println(sb.toString());
	}
	public static String isBal(String s) {
		Stack<Character> st = new Stack<>();
		boolean res = true;
		
		for(char ch : s.toCharArray()){
			if(ch == '(' || ch == '[') {
				st.push(ch);
			}else if(ch == ')') {
				if(st.isEmpty() || st.pop() != '(') {
					res = false;
					break;
				}
			}else if(ch ==']') {
				if(st.isEmpty() || st.pop() != '[') {
					res = false;
					break;
				}
			}
		}
		if(!st.isEmpty())res = false;
		
		return res ? "yes\n" : "no\n";
	}
}
