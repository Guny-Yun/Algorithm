package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1120_문자열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		char[] A = in[0].toCharArray();
		char[] B = in[1].toCharArray();
		
		int min_diff = A.length;
		
		for(int i = 0 ; i <B.length - A.length + 1;i++) {
			int diff = 0;
			for(int j = 0 ; j < A.length;j++) {
				if(A[j] != B[i+j]) diff++;
			}
			min_diff = Math.min(diff, min_diff);
		}
		System.out.println(min_diff);
	}

}
