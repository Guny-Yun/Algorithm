package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_6593_상범빌딩 {
	static int[] di = { -1, 1, 0, 0, 0, 0 };// 2차원 상하좌우
	static int[] dj = { 0, 0, -1, 1, 0, 0 };
	static int[] dh = { 0, 0, 0, 0, 1, -1 };
	static int L,R,C, answer;
	static point start;
	static char[][][] map;
	static class point {
		int i;
		int j;
		int h;
		public point(int h, int i, int j) {
			this.h = h;
			this.i = i;
			this.j = j;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			if(L == 0 && R == 0 && C == 0) break;
			map = new char[L][R][C];
			start = null;
			for (int h = 0; h < L; h++) {
				for (int i = 0; i < R; i++) {
					char[] in = br.readLine().toCharArray();
					for (int j = 0; j < C; j++) {
						char tmp = in[j];
						if (tmp == 'S')
							start = new point(h, i, j);
						map[h][i][j] = tmp;
					}
				}
				String trash = br.readLine();
			}// input
			answer = bfs();
			if(answer == -1) {
				System.out.println("Trapped!");
			}else {
				System.out.println("Escaped in " +answer + " minute(s).");
			}
		}
	}
	public static int bfs() {
		int min = 0;
		Queue<point> q = new LinkedList<>();
		q.offer(start);
		while(!q.isEmpty()) {
			min++;
			int size = q.size();
			while(size-- > 0) {
				point tmp = q.poll();
				for(int k = 0 ; k < 6;k++) {
					int nh = tmp.h + dh[k];
					int ni = tmp.i + di[k];
					int nj = tmp.j + dj[k];
					
					if(ni < 0 || nj < 0 || nh < 0|| ni >= R || nj >=C || nh >= L)continue;
					
					if(map[nh][ni][nj] == '#')continue;
					
					if(map[nh][ni][nj] == 'E')return min;
					
					map[nh][ni][nj] = '#';
					q.add(new point(nh,ni,nj));
				}
			}
		}
		return -1;
	}
}
