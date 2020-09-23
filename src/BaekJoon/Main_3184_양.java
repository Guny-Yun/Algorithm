package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3184_양 {
	static int r, c, tot_o, tot_v, cur_o, cur_v;
	static char[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new char[r][c];
		visit = new boolean[r][c];
		for(int i = 0; i < r; i++) {
			map[i] = br.readLine().toCharArray();
		}
		tot_o = 0;
		tot_v = 0;
		for(int i = 0 ; i < r; i++) {
			for(int j = 0 ; j < c;j++) {
				if(map[i][j] != '#' && !visit[i][j]) {
					cur_o = 0;
					cur_v = 0;
					dfs(i,j);
					if(cur_o > cur_v) {
						tot_o += cur_o;
					}else {
						tot_v += cur_v;
					}
				}
			}
		}
		System.out.println(tot_o + " " + tot_v);
	}
	public static void dfs(int i, int j) {
		visit[i][j] = true;
		if(map[i][j] == 'o')cur_o++;
		else if(map[i][j] == 'v')cur_v++;
		
		for(int k = 0; k < 4; k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			
			if(ni <0 || nj < 0 || ni >=r || nj >= c)continue;
			
			if(map[ni][nj] != '#' && !visit[ni][nj]) {
				dfs(ni,nj);
			}
		}
	}

}
