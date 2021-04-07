package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10448_유레카이론 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr= new int[50];
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = i * (i+1) /2;
		}
		boolean[] ans = new boolean[4000];
		for(int i = 1; i<= 45; i++) {
			for(int j = 1; j <=45;j++) {
				for(int k = 1; k <=45;k++) {
					ans[arr[i] + arr[j] + arr[k]] = true;	
				}
			}
		}
		
		for(int tc= 0; tc<T;tc++) {
			int N = Integer.parseInt(br.readLine());
			if(ans[N]) System.out.println(1);
			else System.out.println(0);
		}
	}

}
