package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9251_LCS {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();

		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		
		for (int i = 1; i <= s1.length(); i++) {
			char tmp1 = s1.charAt(i - 1);
			for (int j = 1; j <= s2.length(); j++) {
				char tmp2 = s2.charAt(j - 1);
				if (tmp1 == tmp2)
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		System.out.println(dp[s1.length()][s2.length()]);
	}
}
