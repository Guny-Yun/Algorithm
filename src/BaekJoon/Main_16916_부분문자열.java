package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_16916_부분문자열 {
	static int answer = 0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String origin = br.readLine();
		String pattern = br.readLine();
		KMP(origin,pattern);
		System.out.println(answer);
	}
	public static void KMP(String ori, String pat) {
		int[] pi = getPi(pat);
		int j = 0;
		for(int i = 0; i< ori.length();i++) {
			while(j > 0 && ori.charAt(i) != pat.charAt(j)) {
				j = pi[j-1];
			}
			if(ori.charAt(i) == pat.charAt(j)) {
				if(j == pat.length()-1) {
					answer = 1;
					break;
				}else j++;
				
			}
		}
	}
	public static int[] getPi(String pat) {
		int[] pi = new int[pat.length()];
		int j = 0;
		for(int i =1 ; i< pat.length();i++) {
			while(j > 0 && pat.charAt(i) != pat.charAt(j)) {
				j = pi[j-1];
			}
			if(pat.charAt(i) == pat.charAt(j)) {
				pi[i] = ++j;
			}
		}
		return pi;
	}
}
