package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_14890_경사로 {
	static int N, L, res;
	static int[][] origin_map, convert_map;
	static int[] ramp;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		res = 0;
		origin_map = new int[N][N];
		convert_map = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				origin_map[i][j] = tmp;
				convert_map[j][i] = tmp;
			}
		}
		for (int i = 0; i < N; i++) {
			check(i, origin_map); // origin 체크
			check(i, convert_map); // convert 체크
		}

		System.out.println(res);
	}

	public static void check(int idx, int[][] map) {
		ramp = new int[N];

		for (int i = 0; i < N - 1; i++) {
			if (map[idx][i] != map[idx][i + 1]) {
				int diff = map[idx][i] - map[idx][i + 1];
				if (diff != -1 && diff != 1)
					return;// 차이가 1보타 큼

				if (diff == -1) {// 왼쪽 경사로
					for (int j = 0; j < L; j++) {
						if (i - j < 0 || ramp[i - j] == 1)
							return;
						if (map[idx][i] == map[idx][i - j])
							ramp[i - j] = 1;
						else
							return;
					}
				} else { // 오른쪽경사
					for (int j = 1; j <= L; j++) {
						if (i + j >= N || ramp[i + j] == 1)
							return;

						if (map[idx][i] - 1 == map[idx][i + j])
							ramp[i + j] = 1;
						else
							return;
					}
				}
			}
		}
		res++;

	}

}
