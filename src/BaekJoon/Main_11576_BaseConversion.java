package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_11576_BaseConversion {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = N-1 ; i >= 0 ; i--) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int res = 0;
		for(int i = 0 ; i < N;i++) {
			res += (arr[i] * Math.pow(A, i));
		}
		
		Stack<Integer> s = new Stack<>();
		while(res != 0) {
			s.add(res % B);
			res = res/B;
		}
		StringBuilder sb = new StringBuilder();
		while(!s.isEmpty()) {
			sb.append(s.pop() + " ");
		}
		System.out.println(sb);
	}

}
