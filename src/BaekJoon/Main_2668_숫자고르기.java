package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main_2668_숫자고르기 {
	static int[] map;
	static boolean[] visit;
	static ArrayList<Integer> list;
	static int l;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		map = new int[N+1];
		visit = new boolean[N+1];
		list = new ArrayList<>();
		for(int i =1 ; i <=N ;i++) {
			map[i] = Integer.parseInt(br.readLine());
		}
		for(int i =1; i<= N;i++) {
			visit[i] = true;
			l = i;
			dfs(i);
			visit[i] = false;
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i : list) {
			System.out.println(i);
		}
	}
	public static void dfs(int v) {
		if(!visit[map[v]]) {
			visit[map[v]] = true;
			dfs(map[v]);
			visit[map[v]] = false;
		}
		if(map[v] == l) list.add(l);
	}
}
