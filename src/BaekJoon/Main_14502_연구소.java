package BaekJoon;

import java.io.*;
import java.util.*;

class Point {
	int x;
	int y;

	Point(int y, int x) {
		this.x = x;
		this.y = y;
	}
}
public class Main_14502_연구소 {
	public static int N, M, max_area;

	// 벽 세우기 //
	public static void wall(int n_wall, int[][] map) {
		if (n_wall == 3) {
			int area = spread(map);
			max_area = max_area < area ? area : max_area;
			return;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					wall(n_wall + 1, map);
					map[i][j] = 0;
				}
			}
		}
	}
	// 안전영역 구하기 //
	public static int cnt_safe(int[][] map) {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0)
					cnt++;
			}
		}
		return cnt;
	}
	public static int spread(int[][] map) {
		Queue<Point> virus;
		int[] dy = { -1, 1, 0, 0 }, dx = { 0, 0, -1, 1 }; // 상하좌우
		virus = new LinkedList<Point>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 2)
					virus.offer(new Point(i, j));
			}
		}
		int[][] tmp = new int[N][M];
		for (int i = 0; i < N; i++) 
			for (int j = 0; j < M; j++)
				tmp[i][j] = map[i][j];
		while (!virus.isEmpty()) {
			Point p = virus.poll();
			int y = p.y, x = p.x;

			for (int d = 0; d < 4; d++) {
				int ny = y + dy[d], nx = x + dx[d];
				if (0 <= ny && ny < N && 0 <= nx && nx < M && tmp[ny][nx] == 0) {
					tmp[ny][nx] = 2;
					virus.offer(new Point(ny, nx));
				}
			}
		}
		return cnt_safe(tmp);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		} // 입력끝
		max_area = 0;
		wall(0, map);
		System.out.println(max_area);
	}
}