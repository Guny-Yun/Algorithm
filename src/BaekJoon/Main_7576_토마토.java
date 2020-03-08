package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7576_토마토 {
	static int[][] map;
	static int N,M;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static class point{
		int i;
		int j;
		int day;
		public point(int i, int j, int day) {
			this.i = i;
			this.j = j;
			this.day = day;
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for(int i = 0; i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력끝
		bfs();//bfs 시작
		
	}//main 끝
	static void bfs() {
		Queue<point> que = new LinkedList<point>();
		int day = 0;
		
		for(int i = 0; i<N;i++) {
			for(int j = 0; j<M;j++) {
				if(map[i][j] == 1) {
					que.offer(new point(i,j,day));
				}
			}
		}
		//세팅 끝
		while(!que.isEmpty()) {
			point p = que.poll();
			day = p.day;
			
			for(int k = 0; k<di.length;k++) {
				int ni = p.i+ di[k];
				int nj = p.j +dj[k];
				
				if(ni<N && nj <M && ni>=0 && nj>=0) {
					if(map[ni][nj] == 0) {
						map[ni][nj] = 1;
						que.add(new point(ni,nj,day+1));
					}
				}
				
			}
		}//bfs 끝
		//결과 체크
		for(int i = 0;i<N;i++) {
			for(int j = 0; j<M;j++) {
				if(map[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(day);
	}

}
