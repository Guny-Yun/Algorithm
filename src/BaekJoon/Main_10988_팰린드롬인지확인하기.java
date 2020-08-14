package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10988_팰린드롬인지확인하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		
		int len = input.length;
		boolean flag  = true;
		for(int i = 0 ; i < len/2;i++) {
			if(input[i]!= input[len- 1 - i]) {
				flag = false;
				break;
			}
		}
		if(flag)System.out.println("1");
		else System.out.println("0");
	}

}
