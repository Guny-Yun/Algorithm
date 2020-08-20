package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1371_가장많은글자 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[26];

		String str;
		while ((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					alpha[str.charAt(i) - 'a']++;
				}
			}
		}

		int max = 0;
		for(int i = 0 ; i < 26;i++) {
			max = Math.max(max, alpha[i]);
		}
		int res = 0;
		for(int i = 0 ; i < 26;i++) {
			if(alpha[i] == max) {
				res = i;
				System.out.print((char)('a' + res));
			}
		}

	}

}
