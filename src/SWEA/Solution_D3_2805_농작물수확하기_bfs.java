package SWEA;

import java.io.*;
import java.util.*;

public class Solution_D3_2805_농작물수확하기_bfs {
	public static int[] di = {-1, 1, 0, 0};
	public static int[] dj = {0, 0, -1, 1};
	public static int N, c, sum;
	public static boolean[][] v;
	public static int[][] m;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			c = (N-1)/2;
			m = new int[N][N];
			v = new boolean[N][N];
			
			for(int i = 0; i < N; i++) {
				String s = sc.next();
				for(int j = 0; j < N; j++) {
					m[i][j] = s.charAt(j)-'0';
				}
			}
			
			sum = 0;
			bfs(c, c);
			System.out.println("#" + tc + " " + sum);
		}
		sc.close();
	}
	
	public static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		v[i][j] = true;
		sum += m[i][j];
		q.offer(new int[] {i, j});
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			for(int d = 0; d < 4; d++) {
				int ni = curr[0] + di[d];
				int nj = curr[1] + dj[d];
				if(0<=ni && ni<N && 0<=nj && nj<N && !v[ni][nj] && (Math.abs(c-ni)+Math.abs(c-nj)<=c)) {
					v[ni][nj] = true;
					sum += m[ni][nj];
					q.offer(new int[] {ni, nj});
				}
			}
		}
	}
}