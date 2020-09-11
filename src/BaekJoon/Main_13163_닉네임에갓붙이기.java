package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_13163_닉네임에갓붙이기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N;i++) {
			String[] in = br.readLine().split(" ");
			String s = "god";
			for(int j = 1; j < in.length;j++) {
				s += in[j];
			}
			System.out.println(s);
		}
		
	}

}
