package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2941_크로아티아알파벳 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int len = in.length();
		int cnt = 0;

		for (int i = 0; i < len; i++) {
			char c = in.charAt(i);

			if (c == 'c' && i < len - 1) {
				if (in.charAt(i + 1) == '=' || in.charAt(i + 1) == '-')
					i++;
			} else if ((c == 'l' || c == 'n') && i < len - 1) {
				if (in.charAt(i + 1) == 'j') {
					i++;
				}
			} else if ((c == 's' || c == 'z') && i < len - 1) {
				if (in.charAt(i + 1) == '=') {
					i++;
				}
			} else if (c == 'd' && i < len - 1) {
				if (in.charAt(i + 1) == '-')
					i++;
				else if (in.charAt(i + 1) == 'z' && i < len - 2)
					if (in.charAt(i + 2) == '=')
						i += 2;
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
