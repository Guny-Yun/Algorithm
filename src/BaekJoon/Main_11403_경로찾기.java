package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_11403_경로찾기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					q.add(j);
				}
			}
			while (!q.isEmpty()) {
				int tmp = q.poll();
				map[i][tmp] = 1;
				for (int j = 0; j < N; j++) {
					if (map[tmp][j] == 1 && map[i][j] != 1) {
						q.add(j);
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(map[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

}
