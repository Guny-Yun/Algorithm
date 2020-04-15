package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_15685_드래곤커브 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[][] map = new boolean[101][101];
		StringTokenizer st;
		int[] dx = { 0, -1, 0, 1 }; // i
		int[] dy = { 1, 0, -1, 0 }; // j

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken()); // j  x
			int x = Integer.parseInt(st.nextToken()); // i  y
			int d = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());

			map[y][x] = true; // x y
			stack.push(d);

			for (int k = 0; k < g; k++) {
				for (int j = stack.size()-1; j >=0; j--) {
					int nd = stack.get(j);
					++nd;
					if (nd == 4)
						nd = 0;
					stack.push(nd);
				}
			}
			int nx = x;
			int ny = y;
			for (int k = 0; k < Math.pow(2, g); k++) {
				int nd = stack.get(k);
				nx += dx[nd];
				ny += dy[nd];
				if (ny >= 0 && ny <= 100 && nx >= 0 && nx <= 100)
					map[ny][nx] = true;
			}
			stack.clear();

		} // 입력값 세팅 끝
		int drag_cnt = 0;
		for(int i = 0 ; i<100; i++) {
			for(int j = 0 ; j <100; j++) {
				if(map[i][j] && map[i][j+1] && map[i+1][j] && map[i+1][j+1]) {
					drag_cnt++;
				}
			}
		}
		System.out.println(drag_cnt);

	}

}
