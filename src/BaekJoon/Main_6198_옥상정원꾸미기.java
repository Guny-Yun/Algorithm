package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_6198_옥상정원꾸미기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long answer = 0;
		Stack<Long> st = new Stack<>();
		for(int i = 0 ; i < N;i++) {
			long tmp = Long.parseLong(br.readLine());
			
			while(!st.isEmpty()) {
				if(st.peek() <= tmp) st.pop();
				else break;
			}
			answer += st.size();
			st.push(tmp);
		}
		System.out.println(answer);
	}
}
