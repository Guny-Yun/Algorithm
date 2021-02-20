package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_16964_DFS스페셜저지 {
	static int N, idx;
	static ArrayList<ArrayList<Integer>> mat;
	static int[] answer;
	static boolean[] visit;
	static boolean flag;
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		mat = new ArrayList<>();
		for(int i = 0 ; i<= N;i++)mat.add(new ArrayList<>());
		visit = new boolean[N+1];
		answer = new int[N];
		flag = true;
		idx = 1;
		for(int i = 0 ; i < N-1; ++i) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			mat.get(start).add(end);
			mat.get(end).add(start);
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ;  i< N ;i++)answer[i] = Integer.parseInt(st.nextToken());
		
		if(answer[0] != 1) {
			System.out.println(0);
			return;
		}
		dfs(1);
		if(flag)System.out.println(1);
		else System.out.println(0);
		
	}
	public static void dfs(int v) {
		if(visit[v])return;
		visit[v] = true;
		
		HashSet<Integer> hs = new HashSet<>();
		for(int next : mat.get(v)) {
			if(visit[next]) continue;
			hs.add(next);
		}
		if(hs.size() == 0)return;
		
		if(hs.contains(answer[idx])) dfs(answer[idx++]);
		else flag = false;
	}

}
