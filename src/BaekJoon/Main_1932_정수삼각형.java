package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1932_정수삼각형 {
	static int N;
	static int[][] arr;
	static Integer[][] dp;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		dp = new Integer[N][N];
		StringTokenizer st;
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < i+1;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < N;i++) {
			dp[N-1][i] = arr[N-1][i];
		}
		System.out.println(sol(0,0));
		
		
	}
	public static int sol(int v, int i) {
		if(v == N-1) return dp[v][i];
		
		if(dp[v][i] == null) {
			dp[v][i] = Math.max(sol(v+1, i), sol(v+1,i+1)) + arr[v][i];
		}
		return dp[v][i];
	}

}
