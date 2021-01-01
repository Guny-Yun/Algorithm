package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_2644_촌수계산 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int map[][] = new int[N+1][N+1];
		
		boolean[] visit = new boolean[N+1];
		int[] cnt = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i< m;i++) {
			st= new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[x][y] = 1;
			map[y][x] = 1;
		}
		Queue<Integer> q = new LinkedList<>();
		visit[a] = true;
		q.add(a);
		while(!q.isEmpty()) {
			int tmp = q.poll();
			
			if(tmp == b) break;
			
			for(int i = 1; i < map.length;i++) {
				if(map[tmp][i] == 1 && !visit[i]) {
					q.add(i);
					visit[i] = true;
					cnt[i] = cnt[tmp] + 1;
				}
			}
		}
		if(cnt[b] == 0) System.out.println(-1);
		else System.out.println(cnt[b]);
	}
}
