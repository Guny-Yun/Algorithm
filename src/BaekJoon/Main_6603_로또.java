package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6603_로또 {
	static int N;
	static int[] arr;
	static int[] res;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();
		while(true) {
			 st = new StringTokenizer(br.readLine());
			 
			 N = Integer.parseInt(st.nextToken());
			 
			 if(N == 0)break;
			 res = new int[N];
			 arr = new int[N];
			 for(int i = 0 ; i < N;i++) {
				 arr[i] = Integer.parseInt(st.nextToken());
			 }
			 dfs(0,0);
			 
			 sb.append("\n");
		}
		System.out.println(sb);
		
	}
	public static void dfs(int start, int v) {
		if(v == 6) {
			for(int i = 0 ; i < N;i++) {
				if(res[i] == 1)sb.append(arr[i] + " ");
				
			}
			sb.append("\n");
			return;
		}
		for(int i = start; i < N;i++) {
			res[i] = 1;
			dfs(i+1, v+1);
			res[i] = 0;
		}
	}

}
