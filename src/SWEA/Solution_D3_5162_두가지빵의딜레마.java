package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_5162_두가지빵의딜레마 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<= T; tc++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			
			int k = Math.min(a, b);
			System.out.println("#" + tc + " " + c/k);
		}
	}
}
