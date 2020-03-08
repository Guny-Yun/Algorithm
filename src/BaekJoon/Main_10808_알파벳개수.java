package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10808_알파벳개수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		int[] quantity = new int[26];
		
		for(int i = 0 ; i<arr.length;i++) {
			quantity[arr[i] - 'a']++;
		}
		for(int i : quantity) {
			System.out.print(i + " ");
		}
		
	}

}
