package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_5536_의석이의세로로말해요 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T;tc++) {
			char[][] map = new char[5][15];
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<5;i++) {
				String input = br.readLine();
				for(int j = 0; j<15;j++) {
					if(input.length() >j)map[i][j] = input.charAt(j);
					else map[i][j] = '@';
				}
			}
			for(int i = 0;i<15;i++) {
				for(int j = 0;j<5;j++) {
					if(map[j][i] != '@')sb.append(map[j][i]);
					else continue;
				}
			}
			System.out.println("#" + tc + " " + sb.toString());
		}
	}
}
