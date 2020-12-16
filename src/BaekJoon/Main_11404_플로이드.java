package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11404_플로이드 {
	static int INF = 987654321;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[][] dis = new int[N+1][N+1];
		for(int i = 1; i <= N;i++) {
			for(int j = 1; j <= N;j++) {
				if(i == j) continue;
				dis[i][j] = INF;
			}
		}
		StringTokenizer st;
		for(int i = 0; i < M;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			dis[start][end] = Math.min(dis[start][end], time);
		}
		
		//floyd
		for(int k = 1;k <= N;k++) {
			for(int i = 1; i <= N; i++) {
				for(int j =1; j <= N;j++) {
					dis[i][j] = Math.min(dis[i][k] + dis[k][j], dis[i][j] );
				}
			}
		}
		
		//print
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i <= N;i++) {
			for(int j = 1; j <= N;j++) {
				if(dis[i][j] >= INF) sb.append("0 ");
				else sb.append(dis[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
