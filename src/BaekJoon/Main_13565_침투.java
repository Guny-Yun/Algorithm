package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13565_침투 {
	static int N,M;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N =Integer.parseInt(st.nextToken());
		M =Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M];
		
		String in;
		for(int i = 0 ; i < N;i++) {
			in = br.readLine();
			for(int j = 0 ; j < M;j++) {
				map[i][j] = in.charAt(j) - '0';
			}
		}
		for(int j = 0; j < M;j++) {
			if(map[0][j] == 0 && !visit[0][j]) {
				dfs(0,j);
			}
		}
		boolean answer = false;
		for(int j = 0 ; j < M;j++) {
			if(visit[N-1][j]) {
				answer = true;
			}
		}
		
		if(answer) {
			System.out.println("YES");
		}else System.out.println("NO");
		
	}
	public static void dfs(int i , int j) {
		visit[i][j] = true;
		
		for(int k = 0 ; k < 4;k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			
			if(ni >= 0 && nj >= 0 && ni < N && nj < M && !visit[ni][nj] && map[ni][nj] == 0) {
				dfs(ni,nj);
			}
		}
	}
}
