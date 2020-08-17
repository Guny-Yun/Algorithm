package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9086_문자열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N ;i++) {
			String in = br.readLine();
			sb.append(in.charAt(0) + "" + in.charAt(in.length()-1));
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
