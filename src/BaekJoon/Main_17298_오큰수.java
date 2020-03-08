package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17298_오큰수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N  = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] inarr = new int[N];
		int[] resarr = new int[N];
		for(int i = 0; i<N;i++) {
			inarr[i] = Integer.parseInt(st.nextToken());
		}//입력끝
		Stack<Integer> s = new Stack<Integer>();
		for(int i = N-1;i>=0;i--) {
			while(!s.isEmpty() && inarr[i] >= s.peek()) {
				s.pop();
			}
			if(s.isEmpty()) {
				resarr[i] = -1;
			}else {
				resarr[i] = s.peek();
			}
			s.push(inarr[i]);
		}
		for(int a :resarr) {
			System.out.print(a + " ");
		}
	}
}
