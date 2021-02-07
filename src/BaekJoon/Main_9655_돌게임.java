package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9655_돌게임 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] stone = new boolean[1001];
		int N = Integer.parseInt(br.readLine());
		for(int i = 1 ; i<= 1000; i++) {
			stone[i] = false;
			if(i-1 >= 0 && !stone[i-1])stone[i] = true;
			
			if(i-3 >= 0 && !stone[i-3])stone[i] = true;
		}
		System.out.println(stone[N] ? "SK" : "CY");
		
	}

}
