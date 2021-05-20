package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2303_숫자게임 {
	static int winner = 0;
	static int maxsum = 0;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][5];
		StringTokenizer st;
		
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}// 입력끝
		int[] score = new int[N];
		for(int i = 0 ; i < N ;i++) {
			for(int j = 0 ; j < 5; j++) {
				for(int k = j +1 ; k < 5; k++) {
					for(int l = k+1; l <5; l++) {
						score[i] = Math.max(score[i], (arr[i][j] + arr[i][k] + arr[i][l]) % 10);
					}
				}
			}
			maxsum = Math.max(maxsum, score[i]);
		}
		for(int i = 0 ; i < N;i++) {
			if(score[i] == maxsum) {
				winner = i+1;
			}
		}
		System.out.println(winner);
	}
}
