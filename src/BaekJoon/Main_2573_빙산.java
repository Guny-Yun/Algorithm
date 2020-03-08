package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main_2573_빙산 {
	static int[] di = { -1, 1, 0, 0 };
	static int[] dj = { 0, 0, -1, 1 };
	static int N, M, year,icecnt;
	static boolean[][] visit;
	static int[][] map;
	static int[][] chkmap;
	static ArrayList<Integer> list;
	public static boolean chk(int[][] arr) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr[i][j] != 0)
					return false;
			}
		}
		return true;
	}
	public static void dfs(int i, int j) {
		icecnt++;
		visit[i][j] = true;
		for(int k = 0;k<4;k++) {
			int ni = i+di[k];
			int nj = j+dj[k];
			if (0 <= ni && 0 <= nj && ni < N && nj < M && map[ni][nj] != 0 && !visit[ni][nj]) {
				dfs(ni,nj);
				visit[ni][nj] = true;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		year = 0;
		int cnt = 0;
		// 구현
		while(true) {//와일문마다 1년++
			list = new ArrayList<Integer>();
			visit = new boolean[N][M];
			chkmap = new int[N][M];
			
			for(int i=0 ;i<N;i++) {
				for(int j = 0; j<M;j++) {
					icecnt = 0;
					if(map[i][j] != 0 && !visit[i][j]) {
						dfs(i,j);
						list.add(icecnt);
					}
				}
			}
			
			if(chk(map)) {
				System.out.println("0");
				break;
			}
			//덩어리가 2개 이상이면 year 출력
			if(list.size()>=2) {
				System.out.println(year);
				break;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					cnt = 0;
					if (map[i][j] != 0) {
						for (int k = 0; k < 4; k++) {
							int ni = i + di[k];
							int nj = j + dj[k];
							if (map[ni][nj] == 0)
								cnt++;
						}
					}//if 끝
					chkmap[i][j] = cnt;
				}
			}
			for(int i = 0 ; i<N;i++) {
				for(int j = 0; j<M;j++) {
					if(map[i][j] -chkmap[i][j] <0)map[i][j] = 0;
					else map[i][j] = map[i][j] - chkmap[i][j];
				}
			}
			year++;
			/////////////////////////////////////////1년 후 끝
		}
	}//main 끝
}