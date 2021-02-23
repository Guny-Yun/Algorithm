package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_2812_크게만들기 {
	static int N, K;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		String num = br.readLine();
		Stack<Integer> s = func(num);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N-K;i++) sb.append(s.get(i));
		System.out.println(sb);
	}
	public static Stack<Integer> func(String num){
		int cnt = 0;
		Stack<Integer> t = new Stack<>();
		for(int i = 0 ; i <N; i++) {
			int tmp = num.charAt(i) - '0';
			
			while(cnt < K && !t.isEmpty() && t.peek() < tmp) {
				t.pop();
				cnt++;
			}
			t.add(tmp);
		}
		return t;
	}
}
