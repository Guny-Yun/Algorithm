package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15694_사다리조작 {
	static int N, M, H, max;
	static boolean[][] visit;
	static int[][] map;
	static boolean flag;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		map = new int[H+2][N+1];
		for(int i = 0 ; i < M;i++) {
			st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = 1;
		}
		for(int i = 0 ; i<=3;i++) {
			max = i;
			dfs(1,1,0);
			if(flag) break;
		}
		System.out.println(flag? max : -1);
		
	}
	public static void dfs(int x, int y, int v) {
		if(flag) return;
		if(max == v) {
			if(chk()) {
				flag = true;
			}
			return;
		}
		for(int i = (y < N ? x : x+1); i <= H; i++) {
			for(int j = 1; j < N;j++) {
				if(map[i][j] == 1 || map[i][j-1] == 1 || map[i][j+1]== 1)continue;
				
				map[i][j] = 1;
				dfs(i,j,v+1);
				map[i][j] = 0;
			}
		}
	}
	public static boolean chk() {
		for(int j = 1;j <= N;j++) {
			int i =1;
			int tmp = j;
			while(i <= H+1) {
				if(map[i][tmp] == 1) {
					tmp++;
				}else if(map[i][tmp-1] == 1) {
					tmp--;
				}
				i++;
			}
			if(j != tmp) {
				return false;
			}
		}
		return true;
	}
}
