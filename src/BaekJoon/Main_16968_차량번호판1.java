package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_16968_차량번호판1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		int answer = 1;

		for (int i = 0; i < in.length; i++) {
			if (i == 0) {
				if (in[i] == 'c')
					answer *= 26;
				else
					answer *= 10;
			} else {
				if (in[i] == in[i - 1]) {
					if (in[i] == 'c')
						answer *= 25;
					else
						answer *= 9;
				} else {
					if (in[i] == 'c')
						answer *= 26;
					else
						answer *= 10;
				}
			}
		}
		System.out.println(answer);
	}
}
