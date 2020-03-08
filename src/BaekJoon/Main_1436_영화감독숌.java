package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1436_영화감독숌 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int idx = 0;
		while(cnt!=num) {
			if(String.valueOf(++idx).contains("666"))cnt++;
		}
		System.out.println(idx);
	}

}
