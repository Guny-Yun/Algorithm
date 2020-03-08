package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2636_치즈 {
	static int N,M,time,cnt, curr;
	static int[][] map;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static public int check() {
		cnt = curr;
		curr = 0;
		for(int i = 0; i<N;i++) {
			for(int j = 0 ;j<M;j++) {
				if(map[i][j] == -1)map[i][j] = 0;
				else if(map[i][j] == 2) {
					map[i][j] = 0;
					curr++;
				}
			}
		}
		return curr;
	}
	static public void dfs(int i, int j) {
		map[i][j] = -1;
		
		for(int k = 0; k<4;k++) {
			int ni = i+di[k];
			int nj = j+dj[k];
			if(ni>=0 && ni<N && nj >=0 && nj<M) {
				if(map[ni][nj] == 1) {
					map[ni][nj] = 2;
				}else if(map[ni][nj] == 0) {
					dfs(ni,nj);
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for(int i = 0 ; i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		time = -1;
		do {
			dfs(0,0);
			time++;
		}while(check()>0);
		
		System.out.println(time);
		System.out.println(cnt);
	}

}
