package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2589_보물섬 {
	static int N, M;
	static char[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		for(int i = 0 ; i < N;i++) {
			String in = br.readLine();
			for(int j = 0 ; j < M;j++) {
				map[i][j] = in.charAt(j);
			}
		}
		
		int answer = 0;
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < M;j++) {
				if(map[i][j] == 'L') {
					visit = new boolean[N][M];
					int val = bfs(i,j);
					answer = Math.max(answer, val);
				}
			}
		}
		System.out.println(answer);
	}
	public static int bfs(int i, int j) {
		Queue<Info> q = new LinkedList<>();
		visit[i][j] = true;
		q.add(new Info(i,j,0));
		int val = 0;
		while(!q.isEmpty()) {
			Info tmp = q.poll();
			
			for(int k = 0 ; k < 4;k++) {
				int ni = tmp.i + di[k];
				int nj = tmp.j + dj[k];
				
				if(ni >=0 && nj >= 0 && ni < N && nj < M && !visit[ni][nj] &&map[ni][nj] == 'L') {
					visit[ni][nj] = true;
					q.add(new Info(ni,nj,tmp.cnt+1));
					val = Math.max(val, tmp.cnt+1);
				}
			}
		}
		return val;
		
	}
	static class Info{
		int i;
		int j;
		int cnt;
		public Info(int i, int j, int cnt) {
			this.i = i;
			this.j = j;
			this.cnt = cnt;
		}
	}
}
