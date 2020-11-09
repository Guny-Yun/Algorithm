package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18111_마인크래프트 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		int time = 987654321;
		int height = -1;
		int max = -1;
		int min = 256;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				map[i][j] = tmp;
				max = Math.max(tmp, max);
				min = Math.min(tmp, min);
			}
		}
		for (int k = max; k >= min; k--) {
			int t = 0;
			int bag = B;
			int target = k;
			boolean flag = true;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == target)
						continue;
					else {
						int diff = Math.abs(target - map[i][j]);
						if (target > map[i][j]) {
							bag -= diff;
							t += diff;
						} else {
							bag += diff;
							t += (2 * diff);
						}
					}

				}
			}
			if(bag < 0)continue;
			
			if(flag && t < time) {
				time = t;
				height = target;
			}
		}
		System.out.println(time + " " + height);

	}

}
