package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1157_단어공부 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine().toUpperCase();
		int n = in.length();
		char[] arr= in.toCharArray();
		int[] alpha = new int[26];
		
		for(int i = 0; i<n;i++) {
			alpha[arr[i]-65]++;
		}
		int max = alpha[0]; //알파벳 배열 A~Z
		int max_idx = 0;
		char res =  (char) (max_idx+65);
		for(int i = 1 ; i<26;i++) {
			if(alpha[i] == 0)continue;
			if(max < alpha[i]) {
				max = alpha[i];
				max_idx = i;
				res = (char) (max_idx + 65);
			}else if(max == alpha[i]) {
				res = '?';
			}	
		}
		System.out.println(res);
	}
}
