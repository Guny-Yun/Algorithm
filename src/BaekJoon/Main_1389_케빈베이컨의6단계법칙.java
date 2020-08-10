package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1389_케빈베이컨의6단계법칙 {
	static int N, M;
	static int[][] map;
	static int[] res;
	static boolean[] visit;
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		res = new int[N+1];
		for(int i = 0 ; i < M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
		}
		for(int i = 1 ; i <= N;i++) {
			visit = new boolean[N+1];
			bfs(i);
		}
		///
		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= N;i++) {
			min = Math.min(res[i], min);
		}
		for(int i = 1; i <= N;i++) {
			if(min == res[i]) {
				System.out.println(i);
				break;
			}
		}
		
	}
	public static void bfs(int v) {
		Queue<Person> q = new LinkedList<>();
		visit[v] = true;
		q.add(new Person(v,0));
		
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			int x = tmp.x;
			int cnt = tmp.cnt;
			for(int i = 1; i <=N;i++) {
				if(map[x][i] == 1 && !visit[i]) {
					q.add(new Person(i,cnt+1));
					visit[i] = true;
					res[i] += cnt + 1;
				}
			}
		}
	}
	
}
class Person{
	int x;
	int cnt;
	Person(int x, int cnt){
		this.x = x;
		this.cnt = cnt;
	}
}
