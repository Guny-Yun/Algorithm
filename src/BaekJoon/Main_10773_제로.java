package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773_제로 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		for(int i = 0 ; i<N;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0 && !st.isEmpty()) {
				st.pop();
			}
			else {
				st.push(a);
			}
			
		}
		int sum = 0;
		while(!st.empty()) {
			sum += st.pop();
		}
		
		System.out.println(sum);
	}
}
