package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_16918_봄버맨 {
	static int R, C, T;
	static int[] di = { -1, 1, 0, 0 };
	static int[] dj = { 0, 0, -1, 1 };
	static int[][] map;
	static Queue<int[]> q = new LinkedList<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		map = new int[R][C];
		
		for (int i = 0; i < R; i++) {
			char[] input = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				if (input[j] == '.') {
					map[i][j] = 0;
				} else {
					map[i][j] = 1;
				}
			}
		}
		
		for (int t = 2; t <= T; t++) {
			if (t % 2 == 0) {
				set(t);
			} else {
				findBomb(t);
				burst();
			}
		}
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.format("%c", map[i][j] == 0 ? '.' : 'O');
			}
			System.out.println();
		}
		
	}
	public static void set(int num) {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] == 0) {
					map[i][j] = num;
				}
			}
		}
	}
	
	public static void findBomb(int num) {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] <= num - 2) {
					q.add(new int[] {i, j});
				}
			}
		}
	}
	
	public static void burst() {
		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			map[tmp[0]][tmp[1]] = 0;

			for (int i = 0; i < 4; i++) {
				int nx = tmp[0] + di[i];
				int ny = tmp[1] + dj[i];
				if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
					map[nx][ny] = 0;
				}
			}
		}
	}
}
