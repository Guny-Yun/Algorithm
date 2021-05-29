package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1305_광고 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String in = br.readLine();
		int p = getPi(in);
		System.out.println(N - p);
	}

	public static int getPi(String s) {
		int l = s.length();
		int j = 0;
		int max = 0;

		int[] pi = new int[l];

		for (int i = 1; i < l; i++) {
			while (j > 0 && s.charAt(j) != s.charAt(i)) {
				j = pi[j - 1];
			}
			if (s.charAt(j) == s.charAt(i)) {
				pi[i] = ++j;
				max = Math.max(max, pi[i]);
			}
		}
		return pi[l - 1];
	}

}
