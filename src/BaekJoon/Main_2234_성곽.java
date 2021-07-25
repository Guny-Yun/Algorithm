package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_2234_성곽 {
	static int[][] map;
	static boolean[][] visit;
	static int room_cnt, max_room;
	static int N, M;
	static int[][] dir = {{0,-1},{-1,0},{0,1},{1,0}};
	static Queue<Node> q;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N =Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		room_cnt = max_room = 0;
		
		q = new LinkedList<>();
		visit = new boolean[M][N];
		map = new int[M][N];
		
		for(int i = 0 ; i < M;i++) {
			st=  new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0 ; i< M;i++) {
			for(int j = 0 ; j < N;j++) {
				if(!visit[i][j]) {
					visit[i][j] = true;
					q.offer(new Node(i,j));
					
					int cur = bfs(room_cnt++);
					max_room = cur > max_room ? cur : max_room;
				}
			}
		}
		System.out.println(room_cnt);
		System.out.println(max_room);
		for(int i = 0 ; i < M;i++) {
			for(int j = 0; j < N;j++) {
				for(int t = 0 ; t < M;t++) {
					Arrays.fill(visit[t], false);
				}//reset
				
				for(int k = 1; k <= 8; k *= 2) {
					if((map[i][j] & k) == k) {
						visit[i][j] = true;
						map[i][j] = map[i][j] - k;
						q.offer(new Node(i,j));
						int cur = bfs(0);
						max_room = cur> max_room ? cur : max_room;
						
						map[i][j] = map[i][j] + k;
					}
				}
			}
		}
		System.out.println(max_room);
	}
	public static int bfs(int num) {
		int cnt = 1;
		while(!q.isEmpty()) {
			Node tmp = q.poll();
			for(int i = 1; i <= 8; i *= 2) {
				if((map[tmp.r][tmp.c] & i) != i) {
					int d = i /2;
					if(d == 4)d--;
					int nr = tmp.r + dir[d][0];
					int nc = tmp.c + dir[d][1];
					
					if(nr >= M || nr < 0 || nc >= N || nc < 0 || visit[nr][nc])continue;
					
					cnt++;
					visit[nr][nc] = true;
					q.offer(new Node(nr,nc));
				}
			}
		}
		return cnt;
	}
	static class Node{
		int r;
		int c;
		public Node(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
}
