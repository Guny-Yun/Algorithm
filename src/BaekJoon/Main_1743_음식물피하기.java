package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1743_음식물피하기 {
	static int N, M, K, cnt, maxSize;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M];
		maxSize = 0;
		for(int i = 0 ; i < K;i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			map[r-1][c-1] = 1;
		}
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < M;j++) {
				if(map[i][j] != 0 && !visit[i][j]) {
					cnt = 0;
					dfs(i,j);
					maxSize = Math.max(maxSize, cnt);
				}
			}
		}
		System.out.println(maxSize);
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		cnt++;
		for(int k = 0 ; k < 4;k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			
			if(ni >=0 && nj >=0 && ni < N && nj < M && !visit[ni][nj] && map[ni][nj] != 0) {
				dfs(ni,nj);
			}
		}
		
	}

}
