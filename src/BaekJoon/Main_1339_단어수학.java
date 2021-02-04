package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1339_단어수학 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] in = new String[N];
		int[] alpha = new int[26];
		
		for(int i = 0 ; i < N;i++) {
			in[i] = br.readLine();
		}
		
		for(int i = 0 ; i < N;i++) {
			int tmp = (int)Math.pow(10, in[i].length()-1);
			for(int j = 0 ; j < in[i].length(); j++) {
				alpha[(int)in[i].charAt(j) - 65] += tmp;
				tmp /= 10;
			}
		}
		Arrays.parallelSort(alpha);
		int idx = 9;
		int answer = 0;
		for(int i = alpha.length - 1; i >=0; i--) {
			if(alpha[i] == 0)break;
			
			answer += alpha[i] * idx;
			idx--;
		}
		System.out.println(answer);
	}
}
