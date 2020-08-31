package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_2667_단지번호붙이기2 {
	static char[][] map;
	static int n, cnt;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static ArrayList<Integer> list;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		visit = new boolean[n][n];
		list = new ArrayList<Integer>();
		for(int i = 0; i < n;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0 ; i < n;i++) {
			for(int j = 0 ; j < n;j++) {
				if(map[i][j] == '1' && !visit[i][j]) {
					cnt = 0;
					dfs(i,j);
					list.add(cnt);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int a : list)System.out.println(a);
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		cnt++;
		for(int k = 0 ; k < 4;k++) {
			int ni = i+ di[k];
			int nj = j + dj[k];
			if(ni>=0 && nj >= 0 && ni <n && nj <n && map[ni][nj] == '1' && !visit[ni][nj]) {
				dfs(ni,nj);
			}
		}
	}

}
