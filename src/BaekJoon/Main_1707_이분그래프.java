package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_1707_이분그래프 {
	static ArrayList<Integer>[] graph;
	static int[] color;
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int tc = 1; tc<= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			graph = new ArrayList[V+1];
			for(int i = 1; i <= V;i++)graph[i] = new ArrayList<>();
			
			for(int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				graph[a].add(b);
				graph[b].add(a);
			}
			color = new int[V+1];
			boolean flag = true;
			
			for(int i = 1; i <= V; i++) {
				if(color[i] == 0) {
					dfs(i, 1);
				}
			}
			for(int i = 1; i <= V; i++) {
				for(int j : graph[i]) {
					if(color[i] == color[j])flag = false;
				}
			}
			if(flag)System.out.println("YES");
			else System.out.println("NO");
		}
	}
	public static void dfs(int i, int c) {
		color[i] = c;
		for(int tmp : graph[i]) {
			if(color[tmp] == 0)dfs(tmp, 3 - c);
		}
	}
}
