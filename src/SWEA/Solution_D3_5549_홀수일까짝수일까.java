package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_5549_홀수일까짝수일까 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T;tc++) {
			String input = br.readLine();
			int num = input.charAt(input.length()-1)-'0';
			System.out.println("#" + tc + " " + (num%2==1?"Odd":"Even"));
		}
	}
}
