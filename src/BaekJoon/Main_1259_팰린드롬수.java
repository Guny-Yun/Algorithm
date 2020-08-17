package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1259_팰린드롬수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String in = br.readLine();
			if(in.equals("0")) {
				break;
			}
			char[] input = in.toCharArray();
			boolean flag = true;
			for(int i = 0 ; i < input.length/2;i++) {
				if(input[i] != input[input.length-1-i]) {
					flag = false;
					break;
				}
			}
			if(flag) sb.append("yes");
			else sb.append("no");
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
