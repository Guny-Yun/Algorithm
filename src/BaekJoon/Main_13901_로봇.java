package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13901_로봇 {
	static int[] di = {0,-1,1,0,0};
	static int[] dj = {0,0,0,-1,1};
	static int[] dir = new int[4];
	static int cnt = 0;
	static boolean[][] visit;
	static int R, C, K;
	public static void dfs(int i, int j, int k) {
		visit[i][j] = true;
		int ni = i + di[dir[k]];
		int nj = j + dj[dir[k]];
		if(ni == -1 || ni == R || nj == -1 || nj ==C || visit[ni][nj]) {
			if(cnt == 4) {
				System.out.println(i + " " + j);
				return;
			}
			cnt++;
			dfs(i,j,(k+1)% 4);
			return;
		}else {
			cnt = 0;
			dfs(ni, nj, k);
			return;
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		visit = new boolean[R][C];
		for(int i = 0 ; i < K;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			visit[a][b] = true;
		}
		st = new StringTokenizer(br.readLine());
		int starti = Integer.parseInt(st.nextToken());
		int startj = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
		for(int i = 0 ; i < 4;i++) {
			dir[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(starti,startj,0);
	}
}
