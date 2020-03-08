package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2606_바이러스 {
	static int N,cnt;
	static int[][] table;
	static boolean[] visit;
	public static void dfs(int start) {
		visit[start] = true;
		for(int i = 1; i<N+1;i++) {
			if(table[start][i] == 1 && !visit[i]) {
				dfs(i);
				cnt++;
			}
		}
	}
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		table = new int[N+1][N+1];
		visit = new boolean[N+1];
		int pair = Integer.parseInt(br.readLine());
		for(int i =0;i<pair;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			table[a][b] = 1;
			table[b][a] = 1;
		}// 입력 끝
		cnt = 0;
		dfs(1);
		System.out.println(cnt);
	}
}
