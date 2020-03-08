package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_DFS와BFS {
	static int N, M, V;
	static boolean[] visit;
	static int[][] map;
	public static void dfs(int i) {
		visit[i] = true;
		System.out.print(i+ " ");
		for(int j = 0 ;j<=N;j++) {
			if(map[i][j] == 1&& visit[j] == false) {
				dfs(j);
			}
		}
	}
	public static void bfs(int i) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(i);
		visit[i] = true;
		while(!que.isEmpty()) {
			int temp = que.poll();
			System.out.print(temp+ " ");
			for(int j = 0; j<=N;j++) {
				if(map[temp][j] == 1 && visit[j] == false) {
					que.offer(j);
					visit[j] = true;
				}
			}
		}
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i = 0; i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
		}
		dfs(V);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(V);
	}
}