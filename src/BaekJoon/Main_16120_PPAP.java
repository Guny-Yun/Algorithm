package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_16120_PPAP {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		Stack<Character> st = new Stack<>();
		
		for(int i = 0 ; i < in.length();i++) {
			char ch = in.charAt(i);
			
			if(ch == 'P')st.push(ch);
			else {
				if(st.size() >= 2 && i < in.length()-1 && in.charAt(i+1) == 'P') {
					st.pop();
					st.pop();
				}else {
					System.out.println("NP");
					return;
				}
			}
		}
		if(st.size() == 1)System.out.println("PPAP");
		else System.out.println("NP");
	}
}
