package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9205_맥주마시면서걸어가기 {
	static int N;
	static boolean[] visit;
	static boolean flag;
	static Pos[] position;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc= 1; tc<= T; tc++) {
			N = Integer.parseInt(br.readLine());
			position = new Pos[N+2];
			visit = new boolean[N+2];
			for(int i = 0 ; i < N + 2;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				position[i] = new Pos(a,b,i);
			}
			visit[0] = true;
			flag = false;
			dfs(position[0].i, position[0].j, position[0].idx);
			
			if(flag) System.out.println("happy");
			else System.out.println("sad");
		}
	}
	public static void dfs(int i, int j, int idx) {
		if(i == position[N+1].i && j == position[N+1].j) {
			flag = true;
			return;
		}else {
			for(int k = 0; k < N+2;k++) {
				int dis = Math.abs(i - position[k].i) + Math.abs(j - position[k].j);
				
				if(flag) {
					return;
				}
				
				if(idx != k) {
					if(!visit[k] && dis <= 1000) {
						visit[k] = true;
						dfs(position[k].i, position[k].j, position[k].idx);
					}
				}
			}
		}
	}
	
	static class Pos{
		int i;
		int j;
		int idx;
		public Pos(int i, int j, int idx) {
			this.i = i;
			this.j = j;
			this.idx = idx;
		}
	}
}
