package Level2;

public class Solution_배달 {
	static int N = 5, K = 3;
	static int[][] road = { { 1, 2, 1 }, { 2, 3, 3 }, { 5, 2, 2 }, { 1, 4, 2 }, { 5, 3, 1 }, { 5, 4, 2 } };

	public static void main(String[] args) {
		int[][] map = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					map[i][j] = 0;
					continue;
				}
				map[i][j] = 500001;
			}
		}
		for (int i = 0; i < road.length; i++) {
			if (map[road[i][0] - 1][road[i][1] - 1] < road[i][2])
				continue;
			map[road[i][0] - 1][road[i][1] - 1] = road[i][2];
			map[road[i][1] - 1][road[i][0] - 1] = road[i][2];
		}
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (i == j)
						continue;

					if (map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (map[0][i] <= K)
				cnt++;
		}
		System.out.println(cnt);
	}

}
