package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10828_스택 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<Integer>();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			String in = st.nextToken();
			if(in.contains("push")){
				stk.push(Integer.parseInt(st.nextToken()));
			}
			else if(in.contains("top")) {
				System.out.println(stk.isEmpty()?-1:stk.peek());
			}
			else if(in.contains("pop")) {
				 System.out.println(stk.isEmpty()?-1:stk.pop());
			}else if(in.contains("size")) {
				System.out.println(stk.size());
			}else if(in.contains("empty")) {
				System.out.println(stk.isEmpty()?1:0);
			}
		}
	}
}
