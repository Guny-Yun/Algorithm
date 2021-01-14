package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1662_압축 {

	static int[] paren = new int[50];
	static char[] in;
	static Stack<Integer> st = new Stack<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		in = br.readLine().toCharArray();
		for(int i = 0 ; i < in.length;i++) {
			if(in[i] == '(') st.push(i);
			if(in[i] == ')') paren[st.pop()] = i; 
		}
		answer = sol(0,in.length);
		System.out.println(answer);
	}
	public static int sol(int start, int end) {
		int len = 0;
		
		for(int i = start; i <end;i++) {
			if(in[i] == '(') {
				len += (in[i-1] - '0') * sol(i+1,paren[i]) - 1;
				i = paren[i];
			}else len++;
		}
		return len;
	}
}
