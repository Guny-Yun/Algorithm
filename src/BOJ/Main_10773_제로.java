package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773_제로 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		int answer = 0;
		for(int i = 0 ; i < K;i++) {
			int tmp = Integer.parseInt(br.readLine());
			if(tmp == 0) {
				st.pop();
			}else {
				st.push(tmp);
			}
		}
		if(!st.isEmpty()) {
			int l = st.size();
			for(int i = 0 ; i < l; i++) {
				answer += st.pop();
			}
		}
		System.out.println(answer);
	}
}
