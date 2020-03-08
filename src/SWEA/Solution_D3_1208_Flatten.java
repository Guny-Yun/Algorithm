package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_1208_Flatten {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int tc = 1; tc<=10;tc++) {
			int dump = Integer.parseInt(br.readLine());
			int[] field = new int[100];
			int res =0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<100;i++) {
				field[i] = Integer.parseInt(st.nextToken());
			}
			for(int i = 0; i<dump;i++) {
				Arrays.sort(field);
				field[99]--;
				field[0]++;
			}
			Arrays.sort(field);
			res = field[99]-field[0];
			System.out.println("#" + tc + " " + res);
			
		}
	}
}
