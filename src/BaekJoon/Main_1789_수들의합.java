package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1789_수들의합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long s = Long.parseLong(br.readLine());
		long sum = 0;
		int num = 0;
		int answer  =0;
		while(sum <= s) {
			sum+= (++num);
		}
		if(sum == s)answer = num;
		else answer = num-1;
		
		System.out.println(answer);
	}

}
