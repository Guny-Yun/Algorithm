package Level2;

import java.util.LinkedList;
import java.util.Queue;


public class Solution_게임맵최단거리 {
	static int[][] maps = { { 1, 0, 1, 1, 1 }, 
						{ 1, 0, 1, 0, 1 }, 
						{ 1, 0, 1, 1, 1 }, 
						{ 1, 1, 1, 0, 1 },
						{ 0, 0, 0, 0, 1 } };
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) {
		int N = maps.length;
		int M = maps[0].length;
		boolean[][] visit = new boolean[N][M];
		int[][] map = new int[N][M];
		
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {0,0});
		map[0][0] = 1;
		visit[0][0] = true;
		
		while(!q.isEmpty()) {
			int[] tmp = q.poll();
			for(int k = 0; k<di.length;k++) {
				int ni = tmp[0]+ di[k];
				int nj = tmp[1] +dj[k];
				
				if(ni<N && nj <M && ni>=0 && nj>=0 && !visit[ni][nj] && maps[ni][nj] == 1) {
					visit[ni][nj] = true;
					map[ni][nj] = map[tmp[0]][tmp[1]]+1;
					q.offer(new int[]{ni,nj});
				}
			}
		}
		if(map[N-1][M-1] != 0)System.out.println(map[N-1][M-1]);
		else System.out.println(-1);
	}
}
