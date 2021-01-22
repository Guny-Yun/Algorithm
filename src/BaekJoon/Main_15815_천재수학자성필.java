package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_15815_천재수학자성필 {

	static Stack<Integer> st = new Stack<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		for(int i = 0 ; i < arr.length;i++) {
			char tmp = arr[i];
			
			if(tmp >= '0' && tmp <='9') {
				st.push(tmp - '0');
			}else {
				calc(tmp);
			}
		}
		System.out.println(st.pop());
	}
	public static void calc(char c) {
		int b = st.pop();
		int a = st.pop();
		
		switch(c) {
		case '+':
			st.push(a+b);
			break;
		case '-':
			st.push(a-b);
			break;
		case '*':
			st.push(a*b);
			break;
		case '/':
			st.push(a/b);
			break;
		}
	}
}
