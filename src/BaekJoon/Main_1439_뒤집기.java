package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1439_뒤집기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		int one = 0;
		int zero = 0;
		
		if(in[0] == '0')zero++;
		else one++;
		
		for(int i = 1; i< in.length;i++) {
			if(in[i-1] != in[i]) {
				if(in[i] == '0')zero++;
				else one++;
			}
		}
		System.out.println(Math.min(one, zero));
		
		
	}

}
