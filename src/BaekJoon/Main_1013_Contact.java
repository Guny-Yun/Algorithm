package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1013_Contact {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N;i++) {
			String tmp = br.readLine().trim();
			String ptn = "(100+1+|01)+";
			System.out.println(tmp.matches(ptn)? "YES" : "NO");
		}
	}
}
