package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3059_등장하지않은문자의합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int sum = 0;
			boolean[] chk = new boolean[26];
			char[] arr = br.readLine().toCharArray();

			for (int j = 0; j < arr.length; j++) {
				if (!chk[arr[j] - 65])
					chk[arr[j] - 65] = true;
			}
			for (int j = 0; j < 26; j++) {
				if (!chk[j])
					sum += j + 65;
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb.toString());

	}

}
