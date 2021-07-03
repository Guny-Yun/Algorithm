package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16938_캠프준비 {
	static int[] prob;
	static int N, L, R, X;
	static int answer;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		prob = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++)prob[i] = Integer.parseInt(st.nextToken());
		
		dfs(0,-1, 1000001, 0, 0);
		
		System.out.println(answer);
	}
	public static void dfs(int start, int max, int min, int sum, int cnt) {
		if(cnt >= 2) {
			if(sum >= L && sum <= R && max-min >= X) answer++;
		}
		
		if(start == N)return;
		
		for(int i = start; i < N ;i++)
			dfs(i+1, Math.max(max, prob[i]), Math.min(min, prob[i]), sum + prob[i], cnt+1);
	}
}
