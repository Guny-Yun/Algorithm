package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2857_FBI {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = new String[6];
		boolean[] check = new boolean[6];
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 5;i++) {
			in[i] = br.readLine();
			if(find(in[i])) {
				check[i] = true;
			}
		}
		for(int i = 1; i <=5; i++) {
			if(check[i])sb.append(i + " ");
		}
		if(sb.length() == 0)sb.append("HE GOT AWAY!");
		
		System.out.println(sb);
		
	}
	public static boolean find(String s) {
		if(s.contains("FBI")) return true;
		else return false;
	}

}
