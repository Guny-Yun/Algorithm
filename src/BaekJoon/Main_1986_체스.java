package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1986_체스 {
	static int map[][];
	static int N, M;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		ArrayList<int[]> Qlist = new ArrayList<>();
		ArrayList<int[]> Klist = new ArrayList<>();
		for(int k = 1 ; k <= 3 ; k++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			for(int i = 0 ; i < n; i++) {
				int r = Integer.parseInt(st.nextToken())-1;
				int c = Integer.parseInt(st.nextToken())-1;
				map[r][c] = k;
				if(k == 1)Qlist.add(new int[] {r,c});
				else if(k == 2)Klist.add(new int[] {r,c});
			}
		}
		for(int i = 0 ; i < Qlist.size();i++) {
			chQueen(Qlist.get(i)[0], Qlist.get(i)[1]);
		}
		for(int i = 0 ; i <Klist.size();i++) {
			chKnight(Klist.get(i)[0], Klist.get(i)[1]);
		}
		int answer = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M;j++) {
				if(map[i][j] == 0) answer++;
			}
		}
		System.out.println(answer);
	}
	public static void chKnight(int r, int c) {
		int[] dr = {2, 2, 1, 1, -1, -1, -2, -2};
        int[] dc = {1, -1, 2, -2, 2, -2, 1, -1};
        for(int k = 0 ; k < 8; k++) {
        	int nr = r + dr[k];
        	int nc = c + dc[k];
        	if(nr >=0 && nc >= 0 && nr < N && nc < M) {
        		if(map[nr][nc] == 0)map[nr][nc] = 5;
        	}
        }
	}
	public static void chQueen(int r, int c) {
        int[] dr = {1, -1, 0, 0, 1, 1, -1, -1};
	    int[] dc = {0, 0, 1, -1, 1, -1, 1, -1};
	    for(int k = 0 ; k < 8;k++) {
	    	int nr = r;
	    	int nc = c;
	    	
	    	while(true) {
	    		nr += dr[k];
	    		nc += dc[k];
	    		if(nr < 0 || nc < 0 || nr >= N || nc >= M) break;
	    		
	    		if(map[nr][nc] == 1 || map[nr][nc] == 2 || map[nr][nc] == 3)break;
	    		
	    		map[nr][nc] = 5;
	    	}
	    }
	}

}
