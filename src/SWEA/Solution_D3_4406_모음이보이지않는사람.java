package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_4406_모음이보이지않는사람 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			String s = br.readLine();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u')
					sb.append(s.charAt(i));
			}
			System.out.println("#" + tc + " " + sb);
		}
	}
}
