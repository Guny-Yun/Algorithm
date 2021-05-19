package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_9372_상근이의여행 {
	static int N, M, answer;
	static int[][] map;
	static boolean[] visit;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 0 ; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			answer = 0;
			map = new int[N+1][N+1];
			visit = new boolean[N+1];
			
			for(int i = 0 ; i < M;i++) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				map[u][v] = 1;
				map[v][u] = 1;
			}
			Queue<Integer> q = new LinkedList<>();
			q.add(1);
			visit[1] = true;
			while(!q.isEmpty()) {
				answer++;
				int tmp = q.poll();
				for(int i = 1; i <=N;i++) {
					if(map[tmp][i] != 0 && !visit[i]) {
						visit[i] = true;
						q.add(i);
					}
					
				}
			}
			System.out.println(answer - 1);
		}
	}
}
