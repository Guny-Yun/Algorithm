package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2563_색종이 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		boolean[][] map = new boolean[100][100];
		int answer = 0;
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int m = x; m < x+10;m++) {
				for(int n = y; n < y+10; n++) {
					if(!map[m][n]) {
						map[m][n] = true;
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}

}
