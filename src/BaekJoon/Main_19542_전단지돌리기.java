package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_19542_전단지돌리기 {
	static int N, S, D;
	static ArrayList<Integer>[] tree;
	static int[] dis;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		
		tree = new ArrayList[N+1];
		dis = new int[N+1];
		for(int i = 0 ; i <= N;i++) {
			tree[i] = new ArrayList<>();
		}
		for(int i = 0; i < N-1;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			tree[a].add(b);
			tree[b].add(a);
		}
		dfs(S,0);
		
		int answer = 0;
		for(int i = 1; i <= N; i++) {
			if(i != S && dis[i] >= D) {
				answer++;
			}
		}
		System.out.println(answer * 2);
		
	}
	public static int dfs(int node, int par) {
		if(node != S && tree[node].size() == 1) {
			return dis[node] = 0;
		}
		for(int i = 0; i < tree[node].size();i++) {
			int next = tree[node].get(i);
			
			if(next == par)continue;
			
			dis[node] = Math.max(dis[node], dfs(next, node) + 1);
		}
		return dis[node];
	}

}
