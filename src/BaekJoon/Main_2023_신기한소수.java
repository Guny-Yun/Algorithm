package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2023_신기한소수 {
	public static int N;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dfs("",0);
		System.out.println(sb);
	}
	public static void dfs(String s, int v) {
		if(v == N) {
			sb.append(s + "\n");
			return;
		}
		for(int i =1 ;i <= 9; i++) {
			if(isPrime(Integer.parseInt(s+i))) {
				dfs(s+i, v+1);
			}
		}
	}
	public static boolean isPrime(int num) {
		if(num == 1)return false;
		
		int sq = (int)Math.sqrt(num);
		for(int i = 2 ; i<= sq; i++) {
			if(num % i ==0)return false;
		}
		return true;
	}
}
