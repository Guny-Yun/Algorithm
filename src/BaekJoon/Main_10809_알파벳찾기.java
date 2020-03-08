package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10809_알파벳찾기 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int[] arr = new int[26];
		for(int i = 0;i<26;i++)arr[i] = -1;
		for(int i = 0 ;i<in.length();i++) {
			if(arr[in.charAt(i)-'a'] == -1) {
				arr[in.charAt(i)-'a'] = i;
			}
		}
		for(int a : arr)System.out.print(a+" ");
	}
}
