package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_16948_데스나이트 {
	
	static int[] dr = { -2, -2, 0, 0, 2, 2 };
	static int[] dc = { -1, 1, -2, 2, -1, 1 };
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int target_r = Integer.parseInt(st.nextToken());
		int target_c = Integer.parseInt(st.nextToken());
		
		Queue<int[]> q = new LinkedList<>();
		int[][] map = new int[201][201];
		
		q.add(new int[] {r,c});
		
		while(!q.isEmpty()) {
			int[] tmp = q.poll();
			int tmp_r = tmp[0];
			int tmp_c = tmp[1];
			
			for(int k = 0 ; k <6;k++) {
				int nr = tmp_r + dr[k];
				int nc = tmp_c + dc[k];
				
				if(nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
				
				if(map[nr][nc] == 0) {
					map[nr][nc] = map[tmp_r][tmp_c] + 1;
					q.add(new int[] {nr,nc});
				}
			}
		}
		if(map[target_r][target_c]==0)System.out.println(-1);
		else System.out.println(map[target_r][target_c]);
	}

}
