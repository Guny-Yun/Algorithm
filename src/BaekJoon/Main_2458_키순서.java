package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2458_키순서 {
	static int N, M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		boolean[][] arr = new boolean[N + 1][N + 1];
		boolean[][] rarr = new boolean[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = true;
			rarr[b][a] = true;
		}

		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (arr[i][k] && arr[k][j])
						arr[i][j] = true;
				}
			}
		}
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (rarr[i][k] && rarr[k][j])
						rarr[i][j] = true;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				arr[i][j] |= rarr[i][j];
			}
		}
		int answer = 0;
		outer: for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j) { 
					continue;
				}
				if (!arr[i][j]) {
					continue outer;
				}
			}
			answer++;
		}
		System.out.println(answer);
	}
}
