package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main_2667_단지번호붙이기 {
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1, 1, 0, 0};
	static int[] dj = {0, 0, -1, 1};
	static int N, cnt;
	static ArrayList<Integer> list;
	public static void dfs(int i , int j) {
		cnt++;
		visit[i][j] = true;
		for(int k = 0;k<4;k++) {
			int ni = i+di[k];
			int nj = j+dj[k];
			if (0 <= ni && 0 <= nj && ni < N && nj < N && map[ni][nj] == 1 && !visit[ni][nj]) {
				dfs(ni,nj);
			}
		}
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N][N];
		list = new ArrayList<Integer>();
		for(int i = 0;i<N;i++) {
			String in = br.readLine();
			for(int j = 0; j<N;j++) {
				map[i][j] = in.charAt(j)-'0';
			}
		}
		
		for(int i = 0 ;i<N;i++) {
			for(int j = 0;j<N;j++) {
				cnt = 0;
				if(map[i][j] == 1&& !visit[i][j]) {
					dfs(i,j);
					list.add(cnt);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for(int a : list) {
			System.out.println(a);
		}
	}

}