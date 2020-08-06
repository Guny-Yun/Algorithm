package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_2210_숫자판점프 {
	static int N = 5;
	static int[][] map;
	static HashSet<String> hs;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new int[N][N];
		hs = new HashSet<String>();
		
		for(int i = 0; i < N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}	
		String tmp = "";
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < N;j++) {
				dfs(i,j,tmp,0);
			}
		}
		System.out.println(hs.size());
		
	}
	public static void dfs(int i, int j, String t, int v) {
		if(v == 6) {
			hs.add(t);
			return;
		}
		
		for(int k = 0 ; k < 4;k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			if(ni >=0 && nj >=0 && ni <N && nj < N) {
				dfs(ni,nj,t+map[ni][nj], v+1);
			}
		}
	}

}
