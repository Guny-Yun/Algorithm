package BaekJoon;

import java.io.*;
import java.util.*;
import java.awt.Point;


public class Main_5427_불 {
	static int w, h;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static int[][] map;
	static boolean[][] visit;
	static char[][] arr;
	static Queue<Point> fire;
	static Point start;
	static boolean possible;
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<= T; tc++) {
			possible= false;
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			arr = new char[h][w];
			map = new int[h][w];
			fire = new LinkedList<>();
			for(int i = 0 ; i < h; i++) {
				String in = br.readLine();
				for(int j = 0 ; j< w; j++) {
					char ch = in.charAt(j);
					if(ch == '@') start = new Point(j,i);
					else if(ch == '*')fire.add(new Point(j,i));
					arr[i][j] = ch;
				}
			}
			//bfs
			bfs();
			
			if(!possible)System.out.println("IMPOSSIBLE");
		}
	}
	public static void bfs() {
		Queue<Point> q = new LinkedList<>();
		q.add(start);
		while(!q.isEmpty()) {
			int fsize = fire.size();
			for(int f = 0 ; f < fsize; f++) {
				Point tmp_fire = fire.poll();
				for(int k = 0 ; k < 4; k++) {
					int ni = tmp_fire.y + di[k];
					int nj = tmp_fire.x + dj[k];
					if(ni >= 0 && ni < h && nj >=0 && nj < w && arr[ni][nj] != '#' && arr[ni][nj] != '*' ) {
						arr[ni][nj] = '*';
						fire.add(new Point(nj,ni));
					}
				}
			}
			int len = q.size();
			for(int l = 0; l < len; l++) {
				Point tmp = q.poll();
				if((tmp.x == 0) || (tmp.y == 0 )|| (tmp.x == w-1) || (tmp.y == h-1) ) {
					possible = true;
					System.out.println(map[tmp.y][tmp.x] + 1);
					return;
				}
				for(int k = 0; k < 4; k++) {
					int ni = tmp.y + di[k];
					int nj = tmp.x + dj[k];
					if(ni >= 0 && ni < h && nj >=0 && nj < w &&  arr[ni][nj] == '.') {
						map[ni][nj] = map[tmp.y][tmp.x]+ 1;
						arr[ni][nj] = '@';
						q.add(new Point(nj,ni));
					}
				}
			}
		}
	}

}
