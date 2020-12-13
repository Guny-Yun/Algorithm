package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13908_비밀번호 {
	static int N, M, answer;
	static boolean[] visit;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visit = new boolean[10];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M;i++) {
			visit[Integer.parseInt(st.nextToken())] = true;
		}
		answer = 0;
		dfs(0,0);
		System.out.println(answer);
	}
	public static void dfs(int i, int v) {
		if(i == N) {
			if(v != M)return;
			answer++;
			return;
		}
		for(int k = 0 ; k <= 9;k++) {
			if(visit[k]) {
				visit[k] = false;
				dfs(i+1,v+1);
				visit[k] = true;
				continue;
			}
			dfs(i+1, v);
		}
	}
}
