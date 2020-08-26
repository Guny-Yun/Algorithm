package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10610_30 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] in = br.readLine().toCharArray();
		int sum = 0;
		boolean flag = false;
		for(int i = 0 ; i < in.length;i++) {
			sum += in[i]-'0';
			if(in[i] == '0')flag = true;
		}
		if(flag && sum%3 == 0) {
			Arrays.sort(in);
			for(int i = in.length-1 ; i >=0;i-- ) {
				sb.append(in[i]);
			}
		}else sb.append("-1");
		
		System.out.println(sb);
	}
}
