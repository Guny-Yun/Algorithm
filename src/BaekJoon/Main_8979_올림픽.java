package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_8979_올림픽 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		long arr[][] = new long[N+1][3]; 
		for(int i = 1 ; i <= N;i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			for(int j = 0 ; j < 3; j++) {
				arr[c][j] = Long.parseLong(st.nextToken());
			}
		}
		long[] score = new long[N+1];
		for(int i = 1; i<= N;i++) {
			score[i] = arr[i][0] * 1000001 * 1000001 + arr[i][1] * 1000001 + arr[i][2];
		}
		int[] rank = new int[N+1];
		Arrays.fill(rank, 1);
		for(int i = 1 ; i <= N;i++) {
			for(int j = 1; j <= N;j++) {
				if(score[i] <score[j]) rank[i]++;
			}
		}
		System.out.println(rank[K]);
	}
}
