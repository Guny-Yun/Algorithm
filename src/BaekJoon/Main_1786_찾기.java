package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_1786_찾기 {
	static int cnt = 0;
	static List<Integer> list;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
		String P = br.readLine();
		list = new ArrayList<>();
		KMP(T, P);
		System.out.println(cnt);
		for(int i : list) {
			System.out.print(i + " ");
		}
	}
	public static void KMP(String T, String P) {
		int[] pi = getPi(P);
		int j = 0;
		for(int i = 0 ; i < T.length();i++) {
			while(j > 0 && T.charAt(i) != P.charAt(j)) {
				j = pi[j-1];
			}
			if(T.charAt(i) == P.charAt(j)) {
				if(j == P.length()-1) {
					cnt++;
					list.add(i - j + 1);
					j = pi[j];
				}else j++;
			}
		}
	}
	
	public static int[] getPi(String P) {
		int[] pi = new int[P.length()];
		int j = 0;
		
		for(int i = 1 ; i < P.length();i++) {
			while(j > 0 && P.charAt(i) != P.charAt(j)) {
				j = pi[j-1];
			}
			if(P.charAt(i) == P.charAt(j)) {
				pi[i] = ++j;
			}
		}
		return pi;
	}
}
