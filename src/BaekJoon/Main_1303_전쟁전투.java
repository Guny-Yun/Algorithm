package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1303_전쟁전투 {
	static int N, M, w_res, b_res;
	static char[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[M][N];
		visit = new boolean[M][N];
		w_res = 0;
		b_res = 0;
		for(int i = 0 ; i < M;i++) {
			String in = br.readLine();
			for(int j = 0 ; j < N;j++) {
				map[i][j] = in.charAt(j);
			}
		}
		
		for(int i = 0 ; i < M;i++) {
			for(int j = 0 ; j < N;j++) {
				if(!visit[i][j]) {
					int tmp = dfs(i,j,map[i][j]);
					if(map[i][j] == 'W') w_res += tmp * tmp;
					else b_res += tmp * tmp;
				}
			}
		}
		
		System.out.println(w_res + " " + b_res);
	}
	public static int dfs(int i, int j, char c) {
		visit[i][j] = true;
		int t = 1;
		for(int k = 0 ; k < 4;k++) {
			int ni = di[k] + i;
			int nj = dj[k] + j;
			
			if(ni >=0 && nj >=0 && ni < M && nj < N && !visit[ni][nj] && map[i][j] == map[ni][nj]) {
				t += dfs(ni,nj,c);
			}
		}
		return t;
	}

}
