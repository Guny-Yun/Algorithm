package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2822_점수계산 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] score = new int[8];
		int[] res_idx = new int[5];
		int[] res_sco = new int[5];
		for(int i = 0; i < 8;i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0;i < 5; i++) {
			int max = 0;
			int idx = 0;
			for(int j = 0 ; j < 8;j++) {
				if(max < score[j]) {
					max = score[j];
					idx = j;
				}
			}
			score[idx] = 0;
			res_sco[i] = max;
			res_idx[i] = idx+1;
		}
		int sum = 0;
		for(int i = 0 ; i < 5;i++) {
			sum += res_sco[i];
		}
		Arrays.parallelSort(res_idx);
		System.out.println(sum);
		for(int a : res_idx) {
			System.out.print(a + " ");
		}
		
	}

}
