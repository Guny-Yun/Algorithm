package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main_1935_후위표기식2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] in = br.readLine().toCharArray();
		Stack<Double> st = new Stack<>();
		ArrayList<Double> num = new ArrayList<>();
		for(int i = 0 ; i < N;i++) {
			num.add(Double.parseDouble(br.readLine()));
		}
		for(int i = 0 ; i< in.length;i++) {
			char ch = in[i];
			if(ch >= 'A' && ch <= 'Z') {
				st.push(num.get(ch-'A'));
			}else {
				double a = st.pop();
				double b = st.pop();
				if(ch == '+') {
					st.push(b + a);
				}else if(ch == '-') {
					st.push(b - a);
				}else if(ch == '*') {
					st.push(b * a);
				}else if(ch == '/') {
					st.push(b / a);
				}
			}
		}
		System.out.println(String.format("%.2f", st.pop()));
	}
}
