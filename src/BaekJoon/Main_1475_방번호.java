package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1475_방번호 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int[] num = new int[9];
		in = in.replace('9', '6');
		int cnt =0;
		for(int i = 0 ; i < in.length();i++) {
			num[in.charAt(i)-'0']++;
		}
		if(num[6] != 0) {
			if(num[6] %2 == 0) {
				num[6] /= 2;
			}else {
				num[6] = (num[6]/2) + 1;
			}
		}
		for(int i = 0 ; i < num.length;i++) {
			cnt = Math.max(cnt, num[i]);
		}
		System.out.println(cnt);
		
	}

}
