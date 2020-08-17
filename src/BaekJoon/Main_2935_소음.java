package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2935_소음 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String op = br.readLine();
		String b = br.readLine();
		StringBuilder sb = new StringBuilder();
		if (a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		sb.append(a);
		
		if (op.equals("+")) {
			if(a.length() == b.length())
                sb.setCharAt(0, '2');
            else
                sb.setCharAt(a.length() - b.length(), '1');
		} else {
			int blen = b.length();
			for (int i = 0; i < blen - 1; i++) {
				sb.append("0");
			}
		}
		System.out.println(sb);

	}

}
