package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_12605_단어순서뒤집기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N;i++) {
			Stack<String> st = new Stack<>();
			String[] in = br.readLine().split(" ");
			for(int j = 0 ; j < in.length;j++) {
				st.push(in[j]);
			}
			sb.append("Case #" + (i+1) + ": ");
			for(int j = 0 ; j < in.length;j++) {
				String out = st.pop();
				if(j == in.length-1) {
					sb.append(out);
					break;
				}
				sb.append(out + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
