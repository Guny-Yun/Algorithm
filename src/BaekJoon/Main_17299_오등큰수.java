package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17299_오등큰수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int[] num = new int[N];
		int[] cnt = new int[1000001];
		int[] answer = new int[N];
		
		for(int i = 0 ; i < N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
			cnt[num[i]] += 1;
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for(int i = 1 ; i< N;i++) {
			if(stack.isEmpty())stack.push(i);
			
			while(!stack.isEmpty() && cnt[num[i]] > cnt[num[stack.peek()]]) {
				answer[stack.pop()] = num[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty()){
			answer[stack.pop()] = -1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< N ;i++) {
			sb.append(answer[i] + " ");
		}
		System.out.println(sb);
	}
}
