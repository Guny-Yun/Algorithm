package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2468_안전영역 {
	static int N;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static int safeArea = 0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		StringTokenizer st;
		int low = 100;
		int high = 0;
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] < low) low = map[i][j];
				if(map[i][j] > high)high = map[i][j];
			}
		} // set end.
		int answer = 1;
		for(int m = low; m < high; m++) {
			visit = new boolean[N][N];
			safeArea = 0;
			for(int i = 0 ; i < N;i++) {
				for(int j = 0 ; j < N;j++) {
					if(!visit[i][j] && map[i][j] > m) {
						dfs(i,j,m);
						safeArea++;
					}
				}
			}
			answer = Math.max(answer, safeArea);
		}
		System.out.println(answer);
	}
	public static void dfs(int i, int j, int hei) {
		visit[i][j] = true;
		
		for(int k = 0 ; k < 4;k++) {
			int ni = di[k] + i;
			int nj = dj[k]+ j;
			
			if(ni>=0 && nj >=0 && ni < N && nj < N && !visit[ni][nj] && map[ni][nj] > hei) {
				dfs(ni,nj,hei);
			}
		}
	}

}
