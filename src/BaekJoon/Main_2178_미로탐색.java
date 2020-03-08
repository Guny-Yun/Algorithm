package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178_미로탐색 {
	static int N,M;
	static int[][] map;
	static boolean[][] visit;
	static Queue<Integer> qi;
	static Queue<Integer> qj;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	
	public static void bfs(int i, int j) {
		qi = new LinkedList<Integer>();
		qj = new LinkedList<Integer>();
		qi.add(i);
		qj.add(j);
		while(!qi.isEmpty() && !qj.isEmpty()) {
			i = qi.poll();
			j = qj.poll();
			visit[i][j] = true;
			for(int k = 0; k<4;k++) {
				int ni = i+di[k];
				int nj = j+dj[k];
				if(ni>=0 && nj >=0 && ni<N && nj <M ) {
					if( map[ni][nj] == 1 && !visit[ni][nj]) {
						qi.add(ni);
						qj.add(nj);
						visit[ni][nj] = true;
						map[ni][nj] = map[i][j] +1;
					}
				}
			}
		}
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M];
		
		
		for(int i = 0;i<N;i++) {
			String in = br.readLine();
			for(int j = 0;j<M;j++) {
				map[i][j] = in.charAt(j)-'0';
			}
		}//입력끝
		bfs(0,0);
		System.out.println(map[N-1][M-1]);
	}
}
