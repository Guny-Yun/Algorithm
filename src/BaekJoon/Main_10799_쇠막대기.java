package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10799_쇠막대기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		Stack<Integer> st = new Stack<Integer>();
		int cnt = 0;
		int idx = 1;
		
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i] == '(') {
				st.push(idx);
			}else {
				if(idx - st.peek() == 1) {
					st.pop();
					cnt+=st.size();
				}else {
					st.pop();
					cnt++;
				}
			}
			idx++;
		}
		System.out.println(cnt);
		
	}

}
