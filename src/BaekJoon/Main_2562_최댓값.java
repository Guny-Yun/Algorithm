package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2562_최댓값 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[]arr = new int[9];
		for(int i = 0; i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int idx = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i <9;i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx+1);
		
	}

}
