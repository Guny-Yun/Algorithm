package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14620_꽃길 {
	static int N, answer = Integer.MAX_VALUE;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N][N];
		
		StringTokenizer st;
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0,1);
		System.out.println(answer);
	}
	public static void dfs(int cnt, int sum, int r) {
		if(cnt == 3) {
			answer = Math.min(answer, sum);
			return ;
		}
		
		for(int i = r ; i < N-1; i++) {
			for(int j = 0 ; j < N-1; j++) {
				if(visit[i][j])continue;
				boolean flag = true;
				for(int k = 0 ; k < 4;k++) {
					int ni = i + di[k];
					int nj = j + dj[k];
					
					if(ni < 0 || nj < 0 || ni >= N || nj >= N || visit[ni][nj]) {
						flag = false;
						break;
					}
				}
				if(!flag) continue;
				
				int cost = map[i][j];
				visit[i][j] = true;
				
				for(int k = 0 ; k < 4;k++) {
					visit[i+ di[k]][j+dj[k]] = true;
					cost += map[i+di[k]][j+dj[k]];
				}
				dfs(cnt +1, sum + cost, i);
				visit[i][j] = false;
				for(int k = 0 ; k < 4; k++) {
					visit[i + di[k]][j + dj[k]] = false;
				}
			}
		}
	}
}
