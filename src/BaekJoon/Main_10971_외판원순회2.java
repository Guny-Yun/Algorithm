package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10971_외판원순회2 {
	static int[][] map;
	static boolean[] visit;
	static int N;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N];
		StringTokenizer st;
		
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ;j < N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i<N;i++) {
			visit[i] = true;
			dfs(i,i,0,0);
			visit[i] = false;
		}
		System.out.println(min);
	}
	static public void dfs(int fix, int now, int sum, int cnt) {
		if(cnt ==N-1) {
			if(map[now][fix] != 0) {
				min = Math.min(min,sum + map[now][fix]);
			}
		}
		
		if(sum >= min)return;
		
		for(int i = 0 ; i < N;i++) {
			if(!visit[i] && map[now][i] != 0) {
				visit[i] = true;
				dfs(fix, i, sum+map[now][i], cnt+1);
				visit[i] = false;
			}
		}
	}

}
