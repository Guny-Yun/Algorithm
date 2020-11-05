package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2741_N찍기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num = 1;
		while(true) {
			sb.append(num + "\n");
			if(num == N)break;
			num++;
		}
		System.out.println(sb);
	}

}
