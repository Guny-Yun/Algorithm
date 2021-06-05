package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11653_소인수분해 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2 ;i <= Math.sqrt(N);i++) {
			while(N % i == 0) {
				sb.append(i + "\n");
				N /= i;
			}
		}
		if(N != 1)sb.append(N);
		System.out.println(sb.toString());
	}

}
