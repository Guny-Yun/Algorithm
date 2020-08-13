package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3449_해밍거리 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0; tc<T;tc++) {
			String in1 = br.readLine();
			String in2 = br.readLine();
			
			int cnt = 0;
			for(int i = 0 ; i < in1.length();i++) {
				if(in1.charAt(i) != in2.charAt(i))cnt++;
			}
			
			System.out.println("Hamming distance is " + cnt + ".");
			
		}
	}

}
