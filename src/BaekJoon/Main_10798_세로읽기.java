package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10798_세로읽기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxlen = 0;
		String res = "";
		String[] arr = new String[5];
		for(int i = 0 ; i < 5;i++) {
			arr[i] = br.readLine();
			maxlen = Math.max(arr[i].length(), maxlen);
		}
		for(int i = 0 ; i < 5;i++) {
			int curlen = arr[i].length();
			if( curlen < maxlen) {
				for(int j = 0 ; j < maxlen - curlen;j++) {
					arr[i] += "#";
				}
			}
		}
		for(int i = 0 ; i < maxlen;i++) {
			for(int j = 0 ; j < 5;j++) {
				if(arr[j].charAt(i) != '#') {
					res += arr[j].charAt(i);
				}
			}
		}
		System.out.println(res);
	}

}
