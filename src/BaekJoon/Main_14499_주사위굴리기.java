package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_14499_주사위굴리기 {
	static class Dice {
		int top, bot, east, west, north, south;

		Dice() {
			this.top = 0;
			this.bot = 0;
			this.east = 0;
			this.west = 0;
			this.north = 0;
			this.south = 0;
		}

		public void moveEast() {
			int tmp = top;
			top = west;
			west = bot;
			bot = east;
			east = tmp;
		}

		public void moveWest() {
			int tmp = top;
			top = east;
			east = bot;
			bot = west;
			west = tmp;
		}

		public void moveSouth() {
			int tmp = top;
			top = north;
			north = bot;
			bot = south;
			south = tmp;
		}

		public void moveNorth() {
			int tmp = top;
			top = south;
			south = bot;
			bot = north;
			north = tmp;
		}
	}

	static int N, M, x, y, K;
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[] command = new int[K];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			command[i] = Integer.parseInt(st.nextToken());
		}// 입력끝

		Dice dice = new Dice();
		int nx, ny;

		for (int i = 0; i < K; i++) {
			int dir = command[i] - 1;
			nx = x + dx[dir];
			ny = y + dy[dir];

			if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
				switch (dir) {
				case 0:// 동
					dice.moveEast();
					break;
				case 1:// 서
					dice.moveWest();
					break;
				case 2:// 북
					dice.moveNorth();
					break;
				case 3:// 남
					dice.moveSouth();
					break;
				}
				if (map[nx][ny] == 0) {
					map[nx][ny] = dice.bot;
				} else {
					dice.bot = map[nx][ny];
					map[nx][ny] = 0;
				}
				x = nx;
				y = ny;

				System.out.println(dice.top);
			}
		}
	}
}
