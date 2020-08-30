package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3085_사탕게임 {
	static int N, answer;
	static char[][] map;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		for(int i = 0 ; i < N;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < N - 1;j++) {
				char tmp = map[i][j];
				map[i][j] = map[i][j+1];
				map[i][j+1] = tmp;
				check();
				tmp = map[i][j+1];
				map[i][j+1] = map[i][j];
				map[i][j] = tmp;
				
				tmp = map[j][i];
				map[j][i] = map[j+1][i];
				map[j+1][i] = tmp;
				check();
				tmp = map[j+1][i];
				map[j+1][i] = map[j][i];
				map[j][i] = tmp;
				
			}
		}
		System.out.println(answer);
	}
	public static void check() {
		for(int i = 0 ; i < N;i++) {
			int cnt = 1;
			for(int j = 1 ; j < N;j++) {
				if(map[i][j] == map[i][j-1]) {
					cnt++;
				}else {
					answer = Math.max(answer, cnt);
					cnt = 1;
				}
			}
			answer = Math.max(answer, cnt);
		}
		for(int i = 0 ; i < N;i++) {
			int cnt = 1;
			for(int j = 1 ; j < N;j++) {
				if(map[j][i] == map[j-1][i]) {
					cnt++;
				}else {
					answer = Math.max(answer, cnt);
					cnt = 1;
				}
			}
			answer = Math.max(answer, cnt);
		}
	}
}
