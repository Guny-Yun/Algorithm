package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2775_부녀회장이될테야 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] map = new int[15][15];
		for(int i = 0 ; i < 15;i++) {
			map[i][1] = 1;
			map[0][i] = i;
		}
		for(int i = 1 ; i < 15;i++) {
			for(int j = 2; j < 15;j++) {
				map[i][j] = map[i][j-1] + map[i-1][j];
			}
		}
		for(int tc = 1; tc<= T; tc++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(map[k][n]);
		}
	}
}
