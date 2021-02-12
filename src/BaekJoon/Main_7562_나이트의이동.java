package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_7562_나이트의이동 {
	static int di[] = {1,2,2,1,-1,-2,-2,-1};
    static int dj[] = {-2,-1,1,2,2,1,-1,-2};
    static Po start, end;
    static int N;
    static boolean[][] visit;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<= T; tc++) {
			N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
			visit = new boolean[N][N];
			
			st = new StringTokenizer(br.readLine());
            start = new Po(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            st = new StringTokenizer(br.readLine());
            end = new Po(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            
			System.out.println(bfs());
		}
		
	}
	public static int bfs() {
		Queue<Po> q = new LinkedList<>();
		q.add(start);
		visit[start.i][start.j] = true;
		
		while(!q.isEmpty()) {
			Po tmp = q.poll();
			if(tmp.i == end.i && tmp.j == end.j) return tmp.dist;
			
			for(int k = 0 ; k < 8 ;k++) {
				int ni = tmp.i + di[k];
				int nj = tmp.j + dj[k];
				
				if(ni < 0 || nj < 0 || ni >= N || nj >= N) continue;
				
				if(visit[ni][nj]) continue;
				
				visit[ni][nj] = true;
				q.add(new Po(ni, nj, tmp.dist + 1));
			}
		
		}
		return 0;
		
	}
	static class Po{
		int i;
		int j;
		int dist;
		public Po(int i, int j, int dist) {
			this.i = i;
			this.j = j;
			this.dist = dist;
		}
	}
}
