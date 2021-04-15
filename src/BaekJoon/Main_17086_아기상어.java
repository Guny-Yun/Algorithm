package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_17086_아기상어 {
	static int N, M;
	static int[][] map;
	static int[] di = {-1,-1,-1,0,1,1,1,0};
	static int[] dj = {-1,0,1,1,1,0,-1,-1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i = 0; i < N ;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int tmp = 0;
		int answer = 0;
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < M;j++) {
				if(map[i][j] == 1)continue;
				
				tmp = bfs(i,j);
				answer = Math.max(tmp, answer);
			}
		}
		System.out.println(answer);
	}
	public static int bfs(int i , int j) {
		boolean[][] visit =new boolean[N][M];
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {i,j,0});
		visit[i][j] = true;
		
		int cnt = 0;
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			for(int k = 0 ; k < 8; k++) {
				int ni = cur[0] + di[k];
				int nj = cur[1] + dj[k];
				int dis = cur[2];
				
				if(ni < 0 || nj < 0 || ni >= N || nj >= M)continue;
				if(visit[ni][nj])continue;
				
				if(map[ni][nj] == 1)return dis + 1;
				
				visit[ni][nj] = true;
				q.offer(new int[] {ni,nj,dis+1});
			}
		}
		return 0;
	}
}
