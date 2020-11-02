package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2742_기찍N {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num = N;
		for(int i = 0 ; i < N;i++) {
			sb.append(num + "\n");
			num--;
		}
		System.out.println(sb);
	}

}
