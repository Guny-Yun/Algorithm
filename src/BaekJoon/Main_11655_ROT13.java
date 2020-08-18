package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11655_ROT13 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < in.length;i++) {
			if(in[i]>='a' && in[i]<='m')
                in[i]+=13;
            else if(in[i]>='n' && in[i]<='z')
                in[i]-=13;
            else if(in[i]>='A' && in[i]<='M')
                in[i]+=13;
            else if(in[i]>='N'&& in[i]<='Z')
                in[i]-=13;
			sb.append(in[i]);
		}
		System.out.println(sb);
		
	}

}
