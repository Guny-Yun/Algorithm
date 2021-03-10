package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_14606_피자 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = (N * (N-1)) / 2;
		System.out.println(answer);
	}
}
