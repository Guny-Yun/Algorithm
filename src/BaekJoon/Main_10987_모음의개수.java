package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10987_모음의개수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		
		int cnt = 0;
		for(int i = 0 ; i < in.length;i++) {
			if(in[i] == 'a' || in[i] == 'e' || in[i] == 'i' || in[i] == 'o' || in[i] == 'u') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
