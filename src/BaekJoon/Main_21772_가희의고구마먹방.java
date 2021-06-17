package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_21772_가희의고구마먹방 {
	static int R, C, T;
	static char[][] map;
	static boolean[][] visit;
	static int answer;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		visit = new boolean[R][C];
		
		Dog gahee = null;
		for(int i = 0 ; i < R; i ++) {
			String in = br.readLine();
			for(int j = 0 ; j < C; j++) {
				map[i][j] = in.charAt(j);
				if(map[i][j] == 'G')gahee = new Dog(i,j,0);
			}
		}
		dfs(gahee, 0);
		
		System.out.println(answer);
	}
	public static void dfs(Dog D, int cnt) {
		if(D.t == T) {
			answer = Math.max(answer, cnt);
			return;
		}
		int i = D.i;
		int j = D.j;
		visit[i][j] = true;
		for(int k = 0 ; k < 4; k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			
			if(ni < 0 || nj < 0 || ni >=R || nj >=C)continue;
			
			if(map[ni][nj] == '#')continue;
			
			if(visit[ni][nj]) dfs(new Dog(ni,nj, D.t+1), cnt);
			else {
				if(map[ni][nj] == 'S') {
					dfs(new Dog(ni,nj,D.t + 1),cnt+1);
					visit[ni][nj] = false;
				}else {
					dfs(new Dog(ni,nj,D.t+1), cnt);
				}
			}
			
		}
	}
	static class Dog {
		int i;
		int j;
		int t;
		public Dog(int i, int j, int t) {
			this.i = i;
			this.j = j;
			this.t = t;
		}
		
	}
}
