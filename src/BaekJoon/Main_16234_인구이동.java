package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 인구이동 횟수 출력
 * 인접 인구 차이가 L 이상 R 이하일 경우에 국경 열림
 * 열린united끼리 평균을 냄
 * 
 * */

public class Main_16234_인구이동 {
	static int N, L, R;
	static boolean go;
	static int[][] map;
	static int[][] check;
	static int[] sum = new int[10001];
	static int[] num = new int[10001];
	static int[] di = { -1, 1, 0, 0 };
	static int[] dj = { 0, 0, -1, 1 };// 상하좌우

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		int cnt = -1; // 정답
		go = true;
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 입력끝
		while (go) {
			Arrays.fill(num, 0);
			Arrays.fill(sum, 0);
			check = new int[N][N];
			int united = 1;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (check[i][j] == 0) {
						dfs(i, j, united);
						united++;
					}
				}
			}
			migration(united);
			cnt++;
		}
		System.out.println(cnt);
	}

	public static void migration(int united) {
		int cnt = 0;
		for (int i = 1; i <= united - 1; i++) {
			if (cnt < num[i])
				cnt = num[i];
			sum[i] = sum[i] / num[i];
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sum[check[i][j]];
			}
		}
		if (cnt < 2)
			go = false;
	}

	public static void dfs(int i, int j, int united) {
		check[i][j] = united;
		sum[united] += map[i][j];
		num[united]++;

		for (int k = 0; k < 4; k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			if (ni >= 0 && ni < N && nj >= 0 && nj < N && check[ni][nj] == 0) {
				int dif = Math.abs(map[i][j] - map[ni][nj]);
				if (L <= dif && dif <= R)
					dfs(ni, nj, united);
			}
		}
	}
}
