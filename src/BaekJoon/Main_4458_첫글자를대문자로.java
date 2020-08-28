package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_4458_첫글자를대문자로 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< N;i++) {
			char[] tmp = br.readLine().toCharArray();
			if(tmp[0] <='z' && tmp[0] >= 'a') {
				tmp[0] = (char)(tmp[0] - 32);
			}
			for(int j = 0 ;j < tmp.length;j++) {
				sb.append(tmp[j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
