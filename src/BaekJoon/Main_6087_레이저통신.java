package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_6087_레이저통신 {
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int[][] cnt = new int[H][W];
		char[][] map = new char[H][W];
		int[] start = new int[2];
		int[] end = new int[2];
		
		for(int i = 0; i < H; i++) Arrays.fill(cnt[i], -1);
		
		boolean se = false;
		for(int i = 0 ; i < H;i++) {
			map[i] = br.readLine().toCharArray();
			for(int j = 0 ; j < W;j++) {
				if(!se && map[i][j] == 'C') {
					start[0] = i;
					start[1] = j;
					se = true;
					cnt[i][j] = 0;
				}else if(se && map[i][j] == 'C') {
					end[0] = i;
					end[1] = j;
				}
			}
		}// input
		
		Queue<Info> q = new LinkedList<>();
		for(int i = 0 ; i < 4; i++) q.offer(new Info(start[0], start[1],i,0));
		
		while(!q.isEmpty()) {
			Info cur = q.poll();
			for(int k = 0 ; k < 4; k++) {
				int ni = cur.i + di[k];
				int nj = cur.j + dj[k];
				
				if(ni < 0 || nj < 0 || ni >= H || nj >= W) continue;
				
				if(map[ni][nj] == '.' || map[ni][nj] == 'C') {
					int next = cur.dir != k ? cur.mirror +1 : cur.mirror; 
					
					if((cnt[ni][nj] == -1) || (cnt[ni][nj] != -1 && cnt[ni][nj] >= next)) {
						cnt[ni][nj] = next;
						q.offer(new Info(ni,nj,k,next));
					}
				}
			}
		}
		System.out.println(cnt[end[0]][end[1]]);
	}
	static class Info{
		int i;
		int j;
		int dir;
		int mirror;
		public Info(int i, int j, int dir, int mirror) {
			this.i = i;
			this.j = j;
			this.dir = dir;
			this.mirror = mirror;
		}
	}
}
