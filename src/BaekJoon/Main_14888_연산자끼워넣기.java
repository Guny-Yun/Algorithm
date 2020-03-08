package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14888_연산자끼워넣기 {
	static int maxres = Integer.MIN_VALUE, minres = Integer.MAX_VALUE, N, num_of_op;
	static int[] op;
	static int[] arr;
	static int[] crr;
	static boolean[] visit;
	//  0 = +   1 = -   2 = *  3 = /
	public static void dfs(int n) {
		if(n == num_of_op) {
			int res = arr[0];
			for(int i = 0; i<num_of_op;i++) {
				if(crr[i] == 0)res += arr[i+1];
				else if(crr[i] == 1)res-= arr[i+1];
				else if(crr[i] == 2)res *= arr[i+1];
				else if(crr[i] == 3)res /= arr[i+1];
			}
			maxres = Math.max(res, maxres);
			minres = Math.min(res, minres);
			return;
		}
		for(int i=0;i<4;i++) {
			if(op[i]>0) {
				op[i]--;
				crr[n] = i;
				dfs(n+1);
				op[i]++;
			}
		}
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[N];
		crr = new int[N-1];
		for(int i = 0 ; i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}// 수열 입력 끝
		op = new int[4];
		num_of_op = N-1;
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i <4;i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}// 연산자 입력 끝
		dfs(0);
		System.out.println(maxres);
		System.out.println(minres);
	}// main 끝

}
