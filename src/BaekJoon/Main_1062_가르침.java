package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1062_가르침 {
	static int N, K, answer;
	static boolean[][] map;
	static boolean[] visit;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new boolean[N][26];
		visit = new boolean[26];
		answer = 0;
		for(int i = 0 ; i < N;i++) {
			
			String in = br.readLine();
			for(int j = 0 ; j < in.length();j++) {
				map[i][in.charAt(j) - 'a'] = true;
			}
		}
		
		dfs(0,0);
		System.out.println(answer);
	}
	public static void dfs(int idx, int v) {
		if(v == K) {
			chk();
			return;
		}
		for(int i = idx; i < 26;i++) {
			if(!visit[i]) {
				visit[i] = true;
				dfs(i, v+1);
				visit[i] = false;
			}
		}
	}
	public static void chk() {
		int cnt = 0;
		boolean flag = true;
		for(int i = 0 ; i < N;i++) {
			flag = true;
			for(int j = 0 ; j < 26;j++) {
				if(map[i][j] && !visit[j]) {
					flag = false;
					break;
				}
			}
			if(flag) cnt++;
		}
		answer = Math.max(cnt, answer);
	}

}
