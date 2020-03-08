package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2580_스도쿠 {
	static int[][] map = new int[9][9];
	static boolean[][] visit = new boolean[9][9];
	static boolean[] num = new boolean[10];
	static ArrayList<int[]> list = new ArrayList<>();

	public static void dfs(int cnt) {
		if(list.size() == cnt) {
			for(int i = 0 ; i<9;i++) {
				for(int j = 0; j<9;j++) {
					System.out.print(map[i][j]+ " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		int ni = list.get(cnt)[0];
		int nj = list.get(cnt)[1];
		for (int m = 1; m < 10; m++) {
			if (garo(ni,nj,m) && sero(ni,nj,m) && nemo(ni, nj,m)) {
				map[ni][nj] = m;
				dfs(cnt+1);
				map[ni][nj]= 0;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 0) {
					list.add(new int[] { i, j });
				}
			}
		}
		dfs(0);
		
	}

	public static boolean garo(int i,int j,int key) {
		for(int k = 0; k<9;k++) {
			if(map[i][k] == key)return false;
		}
		return true;
	}

	public static boolean sero(int i,int j,int key) {
		for(int k = 0; k<9;k++) {
			if(map[k][j] == key)return false;
		}
		return true;
	}
	public static boolean nemo(int i, int j,int key) {
		i = i / 3 * 3;
		j = j / 3 * 3;
		for (int ni = i; ni < i + 3; ni++) {
			for (int nj = j; nj < j + 3; nj++) {
				if(key == map[ni][nj])return false;
			}
		}
		return true;
	}

}
