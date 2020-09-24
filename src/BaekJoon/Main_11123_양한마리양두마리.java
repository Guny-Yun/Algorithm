package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11123_양한마리양두마리 {
	static int H, W, cnt;
	static char[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int tc = 1; tc<= T; tc++) {
			st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			map = new char[H][W];
			visit = new boolean[H][W];
			
			for(int i = 0 ; i < H;i++) {
				map[i] = br.readLine().toCharArray();
			}
			// 입력 끝
			cnt = 0;
			for(int i = 0 ; i < H;i++) {
				for(int j = 0 ; j < W;j++) {
					if(map[i][j] =='#' && !visit[i][j]) {
						dfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		
		for(int k = 0 ; k < 4;k++) {
			int ni = di[k] + i;
			int nj = dj[k]+ j;
			
			if(ni >= 0 && nj >= 0 && ni < H && nj < W && !visit[ni][nj] && map[ni][nj] == '#') {
				dfs(ni,nj);
			}
		}
	}
}
