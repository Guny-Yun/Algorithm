package NHN_PreTest;

import java.io.*;
import java.util.*;

public class Main_Pre_Test_1차기출문제 {
	static int N, area_cnt;
	static int[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N][N];
		StringTokenizer st;
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < N;j++) {
				if(map[i][j] == 1 && !visit[i][j]) {
					area_cnt = 0;
					dfs(i,j);
					list.add(area_cnt);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.size() + "\n");
		Collections.sort(list);
		
		for(int i = 0 ; i < list.size(); i++) {
			sb.append(list.get(i) + " ");
		}
		
		System.out.println(sb);
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		area_cnt++;
		for(int k = 0 ; k < 4;k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			if(ni>=0 && nj >= 0 && ni < N && nj < N && map[ni][nj] ==1 &&!visit[ni][nj]) {
				dfs(ni,nj);
			}
		}
	}
}
