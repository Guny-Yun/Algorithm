package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2660_회장뽑기 {
	static int N;
	static int[][] map;
	static int[] depth;
	static boolean[] visit;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N+1][N+1];
		depth = new int[N+1];
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a == -1 && b == -1)break;
			
			map[a][b] = map[b][a] = 1;
		}
		int min = 100;
		for(int i =1; i <= N;i++) {
			visit = new boolean[N+1];
			bfs(i);
			min = Math.min(depth[i], min);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 1; i <= N;i++) {
			if(min == depth[i])ans.add(i);
		}
		System.out.println(min + " " + ans.size());
		for(int a : ans) System.out.print(a + " ");
		System.out.println();
	}
	public static void bfs(int v) {
		Queue<Person> q = new LinkedList<>();
		q.add(new Person(v,0));
		visit[v] = true;
		int max = 0;
		
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(int i = 1; i <= N;i++) {
				if(map[tmp.x][i] == 0 || visit[i]) continue;
				
				q.add(new Person(i,tmp.cnt +1));
				max = Math.max(max, tmp.cnt+1);
				visit[i] = true;
			}
		}
		depth[v] = max;
	}
	
	static class Person{
		int x;
		int cnt;
		Person(int x, int cnt){
			this.x = x;
			this.cnt = cnt;
		}
	}
}
