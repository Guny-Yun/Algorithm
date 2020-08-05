package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_카카오프렌즈컬러링북 {
	static int m = 6;
	static int n = 4;
	static boolean[][] visit;
	static int[] di = { -1, 1, 0, 0 };
	static int[] dj = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		int[][] picture = { { 1, 1, 1, 0 },
							{ 1, 1, 1, 0 }, 
							{ 0, 0, 0, 1 }, 
							{ 0, 0, 0, 1 }, 
							{ 0, 0, 0, 1 },
							{ 0, 0, 0, 1 } };
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		visit = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int tmpSizeOfOneArea = 0;
				if (picture[i][j] != 0 && !visit[i][j]) {
					numberOfArea++;
					tmpSizeOfOneArea = bfs(i, j, picture);
					maxSizeOfOneArea = Math.max(tmpSizeOfOneArea, maxSizeOfOneArea);
				}
			}
		}
		// 출력부
		int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
		System.out.println(numberOfArea + " " + maxSizeOfOneArea);
	}

	public static int bfs(int i, int j, int[][] map) {
		int cnt = 1;
		visit[i][j] = true;
		Queue<int[]> que = new LinkedList<int[]> ();
		que.offer(new int[]{i,j});
		
		while(!que.isEmpty()) {
			int[] temp = que.poll();
			for(int k = 0 ; k < 4; k++) {
				int ni = temp[0] + di[k];
				int nj = temp[1] + dj[k];
					
				if(ni>=0 && nj >=0 && ni <map.length && nj < map[0].length && !visit[ni][nj] && map[ni][nj] == map[i][j]) {
					visit[ni][nj] = true;
					que.offer(new int[] {ni,nj});
					cnt++;
				}
			}
		}
		return cnt;
	}
}
