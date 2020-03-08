package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D3_4466_최대성적표만들기 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int sum =0;
			int[] score = new int[N];
			for(int i = 0; i<N;i++) {
				score[i] = sc.nextInt();
			}
			Arrays.sort(score);
			for(int i=score.length-1;i>=score.length -K;i--) {
				sum += score[i];
			}
			System.out.println("#" + tc + " " + sum);
		}
		sc.close();
	}
}
