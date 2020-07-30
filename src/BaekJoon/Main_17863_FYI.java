package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_17863_FYI {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		if (in.charAt(0) == '5' && in.charAt(1) == '5' && in.charAt(2) == '5')
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}
