package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1316_그룹단어체커 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = n;
		for (int i = 0; i < n; i++) {
			String in = br.readLine();
			boolean[] alpha = new boolean[26];

			for (int k = 1; k < in.length(); k++) {
				if (in.charAt(k - 1) != in.charAt(k)) {
					if (alpha[in.charAt(k) - 97] == true) {
						cnt--;
						break;
					}
					alpha[in.charAt(k - 1) - 97] = true;
				}
			}
		}
		System.out.println(cnt);

	}
}
