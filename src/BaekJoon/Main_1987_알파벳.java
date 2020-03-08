package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1987_알파벳 {
	static int R, C, maxcnt;
	static char[][] map;
	static boolean[][] visit;
	static List<Character> list;
	static int[] di = { -1, 1, 0, 0 };
	static int[] dj = { 0, 0, -1, 1 };

	public static void dfs(int i , int j) {
		visit[i][j] = true;
		list.add(map[i][j]);
		maxcnt = Math.max(maxcnt, list.size());
		for(int k = 0 ; k<4;k++) {
			int ni = i + di[k];
			int nj = j + dj[k];
			if(ni>=0 && nj >= 0 && ni<R && nj <C && !visit[ni][nj] && !list.contains(map[ni][nj])) {
				dfs(ni,nj);
				list.remove(list.size()-1);
				visit[ni][nj] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		visit = new boolean[R][C];
		list = new ArrayList<Character>();

		for (int i = 0; i < R; i++) {
			String in = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = in.charAt(j);
			}
		}
		maxcnt=0;
		dfs(0, 0);
		System.out.println(maxcnt);
	}
}
