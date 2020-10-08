package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1967_트리의지름 {
	static int N, diameter;
	static ArrayList<Node>[] list;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		list = new ArrayList[N+1];
		for(int i = 0; i <= N;i++) {
			list[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for(int i = 0 ; i < N-1;i++) {
			st = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			list[parent].add(new Node(child, weight));
		}
		diameter = 0;
		dfs(1);
		
		System.out.println(diameter);
		
	}
	public static int dfs(int idx) {
		int sub_1 = 0;
		int sub_2 = 0;
		
		for(int i = 0; i < list[idx].size();i++) {
			Node tmp = list[idx].get(i);
			
			int res = dfs(tmp.idx) + tmp.weight;
			if(res > sub_1) {
				sub_2 = sub_1;
				sub_1 = res;
			}else if(res > sub_2) {
				sub_2 = res;
			}
		}
		diameter = Math.max(sub_1+ sub_2, diameter);
		return sub_1;
	}
	
	static class Node {
		int idx;
		int weight;
		
		public Node(int idx, int weight) {
			this.idx = idx;
			this.weight = weight;
		}
	}
}
