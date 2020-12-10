package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2193_이친수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N+1];
		
		System.out.println(dp(N, arr));
	}
	public static long dp(int N, long[] arr) {
		if(N== 1) return 1;
		else if(N == 2)return 1;
		else if(arr[N] != 0) return arr[N];
		else return arr[N] = dp(N-1,arr) + dp(N-2,arr);
	}
}
