package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10819_차이를최대로 {
	static int N, answer = Integer.MIN_VALUE;
	static int[] arr, tmp;
	static boolean[] visit;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		tmp = new int[N];
		visit = new boolean[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		perm(0);
		
		System.out.println(answer);
	}
	public static void perm(int v) {
		if(v == N) {
			cal();
			return;
		}
		for(int i = 0; i < N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				tmp[v] = arr[i];
				perm(v+1);
				visit[i] = false;
			}
		}
		
	}
	public static void cal() {
		int sum = 0;
		for(int i = 0 ; i < N-1;i++) {
			sum += Math.abs(tmp[i] - tmp[i+1]);
		}
		answer = Math.max(sum, answer);
	}

}
