package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16174_점프왕쩰리 {
	static int N;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {0,1};
	static int[] dj = {1,0};
	static boolean can;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N][N];
		StringTokenizer st;
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0, 0);
		
		if(can) System.out.println("HaruHaru");
		else System.out.println("Hing");
		
	}
	public static void dfs(int i, int j) {
		int jump = map[i][j];
		visit[i][j] = true;
		if(map[i][j] == -1) {
			can = true;
			return;
		}
		
		for(int k = 0 ; k < 2;k++) {
			int ni = di[k] * jump + i;
			int nj = dj[k] * jump + j;
			
			if(ni >= 0 && nj >= 0 && ni < N && nj < N && !visit[ni][nj]) {
				dfs(ni,nj);
			}
		}
	}

}
