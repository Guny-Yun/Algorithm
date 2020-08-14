package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11656_접미사배열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input =  br.readLine();
		int len = input.length();
		String[] arr = new String[input.length()];
		for(int i = 0 ; i < len;i++) {
			arr[i] = input.substring(i, len);
		}
		Arrays.sort(arr);
		for(int i = 0 ; i < len;i++) {
			System.out.println(arr[i]);
		}
	}

}
