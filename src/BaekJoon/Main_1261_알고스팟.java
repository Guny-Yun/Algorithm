package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_1261_알고스팟 {
	static int N, M;
	static int[][] map;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[N+1][M+1];
		for(int i = 1 ; i <= N;i++) {
			String in = br.readLine();
			for(int j =1 ; j<= M;j++) {
				map[i][j] = Character.getNumericValue(in.charAt(j-1));
			}
		}
		int answer = bfs(1,1);
		System.out.println(answer);
	}
	public static int bfs(int i, int j) {
		PriorityQueue<Pos> q = new PriorityQueue<>();
		q.offer(new Pos(i,j,0));
		
		boolean[][] visit = new boolean[N+1][M+1];
		visit[i][j] =true;
		
		while(!q.isEmpty()) {
			Pos tmp = q.poll();
			
			if(tmp.i == N && tmp.j == M)return tmp.cnt;
			
			for(int k = 0 ; k < 4; k++) {
				int ni = tmp.i + di[k];
				int nj = tmp.j + dj[k];
				
				if(ni < 1 || nj < 1 || ni > N || nj > M)continue;
				
				if(!visit[ni][nj] && map[ni][nj] == 0) {
					visit[ni][nj] = true;
					q.offer(new Pos(ni,nj, tmp.cnt));
				}
				
				if(!visit[ni][nj] && map[ni][nj] == 1) {
					visit[ni][nj] = true;
					q.offer(new Pos(ni,nj, tmp.cnt+1));
				}
			}
		}
		return 0;
	}
	static class Pos implements Comparable<Pos>{
		int i;
		int j;
		int cnt;
		Pos(int i ,int j, int cnt) {
			this.i = i;
			this.j = j;
			this.cnt = cnt;
		}
		@Override
		public int compareTo(Pos o) {
			return cnt - o.cnt;
		}
	}
}
