package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_13023_ABCDE {
	static int N;
	static int M;
	static int answer = 0;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N];
		for(int i = 0 ; i < N;i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i = 0 ; i < M ;i++) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		for(int i = 0 ; i < N ;i++) {
			if(answer == 1) break;
			dfs(new boolean[N], i , 0);
		}
		System.out.println(answer);
	}
	public static void dfs(boolean[] visit, int num, int cnt) {
		if(answer == 1) return;
		if(cnt>= 5) {
			answer = 1;
			return;
		}
		for(int i = 0 ; i < arr[num].size();i++) {
			int tmp = arr[num].get(i);
			
			if(!visit[tmp]) {
				visit[tmp] = true;
				dfs(visit, tmp, cnt+1);
				visit[tmp] = false;
			}
		}
	}

}
