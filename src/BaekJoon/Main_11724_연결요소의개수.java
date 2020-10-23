package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11724_연결요소의개수 {
	static int N, M, cnt;
	static boolean[] visit;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M =Integer.parseInt(st.nextToken());
		list = new ArrayList[N+1];
		visit = new boolean[N+1];
		for(int i = 1 ; i <= N;i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 0 ; i < M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		for(int i = 1; i <= N;i++) {
			if(!visit[i]) {
				cnt++;
				dfs(i);
			}
		}
		System.out.println(cnt);
		
	}
	public static void dfs(int v) {
		visit[v] = true;
		
		for(int i = 0; i < list[v].size();i++) {
			if(!visit[list[v].get(i)]) {
				dfs(list[v].get(i));
			}
		}
	}
}
