package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10974_모든순열 {
	static int N;
	static boolean[] visit;
	static int[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N+1];
		visit = new boolean[N+1];
		for(int i = 1; i <= N ; i++) {
			visit[i] = true;
			perm(i,1);
			visit[i] = false;
		}
	}
	public static void perm(int start, int v) {
		arr[v] = start;
		if(v == N) {
			for(int i = 1;  i<= N;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = 1; i <= N ;i++) {
			if(visit[i])continue;
			
			visit[i] = true;
			perm(i,v+1);
			visit[i] = false;
		}
	}
}
