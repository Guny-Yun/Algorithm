package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_1405_미친로봇 {
	static int N;
	static boolean[][] map;
	static double[] per;
	static double answer;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		per = new double[4];
		answer = 0;
		
		for(int i = 0 ; i < 4;i++) {
			per[i] = Double.parseDouble(st.nextToken()) * 0.01;
		}
		map = new boolean[30][30];
		map[15][15] = true;
		
		dfs(15,15,0,1);
		
		System.out.println(answer);
	}
	public static void dfs(int i, int j, int v, double res) {
		if(v == N) {
			answer += res;
			return;
		}
		for(int k = 0 ; k < 4;k++) {
			int ni = di[k] +i;
			int nj = dj[k] + j;
			
			if(ni >= 0 && nj >= 0 && ni < 30 && nj < 30) {
				if(!map[ni][nj]) {
					map[ni][nj] = true;
					dfs(ni, nj, v+1, res * per[k]);
					map[ni][nj] = false;
				}
			}
		}
	}
}	
