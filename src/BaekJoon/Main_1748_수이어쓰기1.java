package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1748_수이어쓰기1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int num = Integer.parseInt(in);
		int len = in.length();
		int nine = 9;
		int answer = 0;
		
		for(int i = 1 ; i < len;i++) {
			answer += i * nine;
			nine *= 10;
		}
		answer += (int)(num - Math.pow(10, len-1) + 1) * len;
		
		System.out.println(answer);
	}

}
