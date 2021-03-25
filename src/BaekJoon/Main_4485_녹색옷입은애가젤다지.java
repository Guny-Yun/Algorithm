package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_4485_녹색옷입은애가젤다지 {
	static int N;
	static int[][] map;
	static int[][] dp;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static int answer;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = 1;
		StringTokenizer st;
		while(true) {
			answer = 0;
			N = Integer.parseInt(br.readLine());
			if(N == 0)break;
			map = new int[N][N];
			for(int i = 0 ; i < N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0 ; j < N;j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			System.out.println("Problem " + TC + ": " + bfs(0,0));
			TC++;
		}
	}
	public static int bfs(int i, int j) {
		Queue<Pos> q = new LinkedList<>();
		dp = new int[N][N];
		for(int ii = 0 ; ii < N;ii++) {
			for(int jj = 0 ; jj <N;jj++) {
				dp[ii][jj] = Integer.MAX_VALUE;
			}
		}
		q.add(new Pos(i,j));
		dp[0][0] = map[0][0];
		while(!q.isEmpty()) {
			Pos tmp = q.poll();
			
			for(int k = 0 ; k < 4; k++) {
				int ni = tmp.i + di[k];
				int nj = tmp.j + dj[k];
				if(ni >= 0 && nj >=0 && ni < N && nj < N) {
					if(dp[ni][nj] > dp[tmp.i][tmp.j] + map[ni][nj]) {
						dp[ni][nj] = dp[tmp.i][tmp.j] + map[ni][nj];
						q.add(new Pos(ni,nj));
					}
				}
			}
		}
		return dp[N-1][N-1];
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
