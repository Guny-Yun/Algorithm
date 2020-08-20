package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2495_연속구간 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < 3;i++) {
			int cnt = 1;
			int res = 0;
			char[] arr = br.readLine().toCharArray();
			
			for(int j = 0 ; j < 7;j++) {
				if(arr[j] == arr[j+1]) {
					cnt++;
				}else {
					res = Math.max(cnt, res);
					cnt = 1;
				}
				res = Math.max(cnt, res);
			}
			sb.append(res+"\n");
		}
		System.out.println(sb);
		
	}

}
