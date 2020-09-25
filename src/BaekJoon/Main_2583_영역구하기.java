package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_2583_영역구하기 {
	static int N, M, cnt;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		map = new int[M][N];
		
		for(int t = 0 ; t < K;t++) {
			st= new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int i = x1 ; i < x2; i++) {
				for(int j = y1; j < y2; j++) {
					map[j][i] = 1;
				}
			}
		}
		visit = new boolean[M][N];
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < M;i++) {
			for(int j = 0; j < N;j++) {
				if(map[i][j] == 0 && !visit[i][j]) {
					cnt = 0;
					dfs(i,j);
					list.add(cnt);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for(int i = 0; i < list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		cnt++;
		for(int k = 0 ; k < 4;k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			
			if(ni >= 0 && nj >=0 && ni < M && nj < N && !visit[ni][nj] && map[ni][nj] == 0) {
				dfs(ni,nj);
			}
		}
	}
}
