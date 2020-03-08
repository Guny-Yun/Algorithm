package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14889_스타트와링크 {
	static int N, min_res = Integer.MAX_VALUE;
	static int[][] map;
	static int[] steam, lteam;
	static boolean[] visit;
	public static void dfs(int n, int v) {
		if(v==N)return ;
		if(n == N/2) {
			int idx = 0;
			for(int i = 0;i<N;i++) {
				if(!visit[i])lteam[idx++] = i;
			}
			int ssteam = 0;
			int slteam = 0;
			for(int i=0;i<N/2;i++) {
				for(int j=0;j<N/2;j++) {
					ssteam+=map[steam[i]][steam[j]];
					slteam+=map[lteam[i]][lteam[j]];
				}
			}
			min_res = Math.min(min_res, Math.abs(ssteam-slteam));
			return ;
		}
		if(!visit[v]) {
			visit[v] = true;
			steam[n] = v;
			dfs(n+1,v+1);
			visit[v] = false;
		}
		dfs(n,v+1);
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		steam = new int[N/2];
		lteam = new int[N/2];
		visit = new boolean[N];
		for(int i = 0; i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0);
		System.out.println(min_res);
	}

}