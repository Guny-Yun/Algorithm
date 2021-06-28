package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2447_별찍기10 {
	static char[][] map;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		map = new char[N][N];
		
		rec(0,0,N,false);
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < N;j++) {
				sb.append(map[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	public static void rec(int r, int c, int N, boolean flag) {
		if(flag) {
			for(int i = r; i < r+ N;i++) {
				for(int j = c; j < c+N; j++) {
					map[i][j] = ' ';
				}
			}
			return;
		}
		
		if(N == 1) {
			map[r][c] = '*';
			return;
		}
		int s = N/ 3;
		int cnt = 0;
		for(int i = r; i < r+N; i += s) {
			for(int j = c; j < c+ N; j+= s) {
				cnt++;
				if(cnt == 5) rec(i,j,s,true);
				else rec(i,j,s,false);
			}
		}
	}
}
