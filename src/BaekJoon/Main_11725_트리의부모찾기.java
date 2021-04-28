package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11725_트리의부모찾기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		StringTokenizer st;
		ArrayList<Integer>[] arr = new ArrayList[N+1];
		for(int i = 0; i <= N;i++)arr[i] = new ArrayList<Integer>();
		for(int i = 0; i < N-1;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		int[] p = new int[N+1];
		
		dfs(arr, p, N, 1, 0);
		
		for(int i = 2; i <= N; i++) {
			System.out.println(p[i]);
		}
	}
	public static void dfs(ArrayList<Integer>[] list, int[] parents, int N, int start, int parent) {
		parents[start] = parent;
		for(int tmp : list[start]) {
			if(tmp != parent)dfs(list,parents,N,tmp,start);
		}
	}
}
