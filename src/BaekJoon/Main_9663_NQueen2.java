package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9663_NQueen2 {
	static int N, cnt;
	static int[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		cnt = 0;
		for(int i = 1; i <= N;i++) {
			arr = new int[N+1];
			arr[1] = i;
			
			dfs(1);
		}
		System.out.println(cnt);
	}
	public static void dfs(int v) {
		if(v == N) {
			cnt++;
		}else {
			for(int i = 1; i <= N;i++) {
				arr[v+1] = i;
				if(possible(v+1)) {
					dfs(v+1);
				}
			}
		}
	}
	public static boolean possible(int v) {
		for(int i = 1; i < v;i++) {
			if(arr[i] == arr[v] || Math.abs(i - v) == Math.abs(arr[i] - arr[v]))return false;
		}
		return true;
	}
}
