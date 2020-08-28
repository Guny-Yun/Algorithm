package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5586_JOI와IOI {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		int joi = 0;
		int ioi = 0;
		int len = in.length;
		for(int i = 0 ; i < len;i++) {
			if(in[i] == 'J') {
				if(i+1 < len && in[i+1] =='O') {
					if(i+2<len && in[i+2] == 'I') {
						joi++;
					}
				}
			}
			if(in[i] == 'I') {
				if(i+1 < len && in[i+1] =='O') {
					if(i+2<len && in[i+2] == 'I') {
						ioi++;
					}
				}
			}
		}
		System.out.println(joi);
		System.out.println(ioi);
		
	}

}
