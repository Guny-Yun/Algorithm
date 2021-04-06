package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_16973_직사각형탈출 {
	static int N, M, H, W, sr, sc, fr, fc;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args)throws Exception {
		input();
		
		solve();
	}
	
	public static void solve() {
		int answer = 987654321;
		Queue<Pos> q = new LinkedList<>();
		visit[sr][sc] = true;
		q.offer(new Pos(sr,sc,0));
		while(!q.isEmpty()) {
			Pos tmp = q.poll();
			if(tmp.r == fr && tmp.c == fc) {
				if(answer > tmp.cnt)answer = tmp.cnt;
			}
			
			for(int k = 0; k < 4; k++) {
				int nr = tmp.r + di[k];
				int nc = tmp.c + dj[k];
				if(nr < 1 || nc < 1 || nr > N || nc > M || visit[nr][nc])continue;
				
				if(!chk(nr,nc)) continue;
				
				visit[nr][nc] = true;
				q.offer(new Pos(nr,nc,tmp.cnt+1));
			}
		}
		System.out.println(answer == 987654321 ? -1 : answer);
	}
	
	public static boolean chk(int r, int c) {
		for(int i = r; i < r + H; i++) {
			for(int j = c; j < c + W; j++) {
				if(i < 1 || j < 1 || i > N || j > M || map[i][j] == 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void input() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N+1][M+1];
		visit = new boolean[N+1][M+1];
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st=  new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		sr = Integer.parseInt(st.nextToken());
		sc = Integer.parseInt(st.nextToken());
		fr = Integer.parseInt(st.nextToken());
		fc = Integer.parseInt(st.nextToken());
	}
	
	static class Pos{
		int r;
		int c;
		int cnt;
		public Pos(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
	}
}
