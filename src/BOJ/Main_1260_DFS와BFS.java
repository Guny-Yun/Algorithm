package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_DFS와BFS {
	static int N,M,V;
	static boolean[] visit;
	static int[][] map;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		visit=  new boolean[N+1];
		
		for(int i = 0; i < M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
		}
		dfs(V);
		Arrays.fill(visit, false);
		System.out.println();
		bfs(V);
	}
	public static void dfs(int v) {
		visit[v] = true;
		System.out.print(v+ " ");
		
		for(int j = 0 ; j <= N;j++) {
			if(map[v][j] == 1 && !visit[j])dfs(j);
		}
	}
	public static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		visit[v] = true;
		while(!q.isEmpty()) {
			int tmp = q.poll();
			System.out.print(tmp + " ");
			for(int j = 0; j <=N;j++) {
				if(map[tmp][j] == 1 && !visit[j]) {
					q.offer(j);
					visit[j] = true;
				}
			}
		}
	}
}
