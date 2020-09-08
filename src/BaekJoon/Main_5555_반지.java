package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5555_반지 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tar = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		String in = "";
		for(int i = 0 ; i < N;i++) {
			in = br.readLine();
			in += in;
			
			if(in.contains(tar)) answer++;
		}
		System.out.println(answer);
	}
}
