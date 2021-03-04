package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1189_컴백홈 {
	static int R,C,K;
	static char[][] map;
	static boolean[][] visit;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new char[6][6];
		for(int i = 0 ; i < R; i++) {
			map[i] = br.readLine().toCharArray();
		}
		visit = new boolean[6][6];
		visit[R-1][0] = true;
		map[0][C-1] = 'H';
		
		int answer = dfs(R-1,0,1);
		System.out.println(answer);
	}
	public static int dfs(int i, int j, int cnt) {
		if(cnt == K) {
			return map[i][j]=='H' ? 1:0;
		}
		int ret = 0;
		for(int k = 0 ; k < 4; k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			if(ni < 0 || nj <0 || ni>=R || nj >= C ||map[ni][nj] =='T' || visit[ni][nj])continue;
			
			visit[ni][nj] = true;
			ret += dfs(ni,nj,cnt+1);
			visit[ni][nj] = false;
		}
		return ret;
	}
}
