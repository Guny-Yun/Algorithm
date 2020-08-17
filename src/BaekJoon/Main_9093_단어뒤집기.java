package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9093_단어뒤집기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder("");
		for(int i = 0 ; i < N ; i++) {
			String input = br.readLine();
			if(input.length() == 0) {
				sb.append("\n");
			}
			String[] in = input.split(" ");
			for(int j = 0 ; j < in.length;j++) {
				String tmp = new StringBuffer(in[j]).reverse().toString();
				sb.append(tmp + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
