package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1325_효율적인해킹 {
	static int N, M;
	static ArrayList<Integer>[] list;
	static boolean[] visit;
	static int[] res;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		res = new int[N+1];
		list = new ArrayList[N+1];
		for(int i = 1 ; i <= N; i++) {
			list[i] = new ArrayList();
		}
		for(int i = 0 ; i < M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
		}
		for(int i = 1; i <= N;i++) {
			visit = new boolean[N+1];
			bfs(i);
		}
		int max = 0;
		for(int i = 1; i <= N;i++) {
			max = Math.max(max, res[i]);
		}
		for(int i = 1; i<=N;i++) {
			if(res[i] == max) {
				System.out.print(i + " ");
			}
		}
	}
	public static void bfs(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		visit[v] = true;
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			for(int i = 0 ; i < list[tmp].size();i++) {
				int t = list[tmp].get(i);
				if(!visit[t]) {
					visit[t] = true;
					res[t]++;
					q.add(t);
				}
			}
		}
	}
}
