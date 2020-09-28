package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_3055_탈출 {
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static Pos hedge;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] map = new char[N][M];
		int[][] dis = new int[N][M];
		Queue<Pos> water = new LinkedList<>();
		Queue<Pos> hog = new LinkedList<>();
		for(int i = 0 ; i < N;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < M;j++) {
				char tmp = map[i][j];
				if(tmp == 'D') hedge = new Pos(i,j);
				else if(tmp == 'S')hog.add(new Pos(i,j));
				else if(tmp == '*')water.add(new Pos(i,j));
			}
		}// 세팅 끝
		
		while(!hog.isEmpty()) {
			int w_size = water.size();
			while(w_size > 0) {
				Pos tmp = water.poll();
				for(int k = 0 ; k < 4;k++) {
					int ni = tmp.i + di[k];
					int nj = tmp.j + dj[k];
					if(ni >= 0 && nj >= 0 && ni < N && nj < M) {
						if(map[ni][nj] == '.' || map[ni][nj] == 'S') {
							map[ni][nj] = '*';
							water.add(new Pos(ni,nj));
						}
					}
				}
				w_size--;
			}
			int h_size = hog.size();
			while(h_size > 0) {
				Pos tmp = hog.poll();
				for(int k = 0 ; k < 4;k++) {
					int ni = tmp.i + di[k];
					int nj = tmp.j + dj[k];
					if(ni >= 0 && nj >= 0 && ni < N && nj < M) {
						if(map[ni][nj] != 'X' && map[ni][nj] != '*') {
							if(dis[ni][nj] == 0) {
								dis[ni][nj] = dis[tmp.i][tmp.j]+1;
								hog.add(new Pos(ni,nj));
							}
						}
					}
				}
				h_size--;
			}
		}
		if(dis[hedge.i][hedge.j] == 0)System.out.println("KAKTUS");
		else System.out.println(dis[hedge.i][hedge.j]);
		
	}

	static class Pos{
		int i;
		int j;
		public Pos(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
}