package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5218_알파벳거리 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N;i++) {
			String[] in = br.readLine().split(" ");
			sb.append("Distances: ");
			for(int j = 0 ; j < in[0].length();j++) {
				char x = in[0].charAt(j);
				char y = in[1].charAt(j);
				int diff = 0;
				if(y >= x)diff = y-x;
				else diff = y+26 - x;
				sb.append(diff+ " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}

}
