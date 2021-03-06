package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14225_부분수열의합 {
	static int N;
	static boolean[] visit;
	static int[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		int sum = 0;

		StringTokenizer st =new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		visit = new boolean[sum + 2];
		
		dfs(0,0);
		
		for(int i =1 ; i< visit.length;i++) {
			if(!visit[i]) {
				System.out.println(i);
				break;
			}
		}
	}
	public static void dfs(int idx, int sum) {
		if(idx>=1) {
			visit[sum] = true;
		}
		if(idx == N)return;
		
		for(int i = idx; i < N;i++) {
			dfs(i+1, sum+arr[i]);
		}
	}
}
