package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11328_Strfry {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<= T; tc++) {
			String[] in = br.readLine().split(" ");
			char[] arr1 = new char[26];
			char[] arr2 = new char[26];
			
			if(in[0].length() != in[1].length()) {
				System.out.println("Impossible");
				continue;
			}
			
			for(int i = 0 ; i < in[0].length();i++) {
				arr1[in[0].charAt(i) - 'a']++;
				arr2[in[1].charAt(i) - 'a']++;
			}
			boolean flag = true;
			for(int i = 0 ; i < 26;i++) {
				if(arr1[i] != arr2[i]) {
					flag = false;
					break;
				}
			}
			if(flag)System.out.println("Possible");
			else System.out.println("Impossible");
		}
	}
}
