package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main_1874_스택수열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st = new Stack<>();
		ArrayList<String> ans = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		int num = 1;
		for(int i = 1 ; i <= N ;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i<= N;i++) {
			st.push(i);
			ans.add("+");
			while(!st.empty() && st.peek() == arr[num]) {
				st.pop();
				ans.add("-");
				num++;
			}
		}
		
		if(st.empty()) {
			for(String s : ans) {
				System.out.println(s);
			}
		}else {
			System.out.println("NO");
		}
		
	}

}
