package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1159_농구경기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] alpha = new int[26];
		for(int i = 0; i < N;i++) {
			String in = br.readLine();
			char tmp = in.charAt(0);
			alpha[tmp-97]++;
		}
		String answer = "";
		for(int i = 0 ; i < 26; i++) {
			if(alpha[i] >=5)answer += (char)(i+97);
		}
		if(answer.equals(""))System.out.println("PREDAJA");
		else System.out.println(answer);
	}

}
