package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18429_근손실 {
	static int N, K, w, res;
	static int[] kit, power;
	static boolean[] visit;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		res = 0;
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		power = new int[N];
		kit = new int[N];
		visit = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			power[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		System.out.println(res);
	}
	public static void dfs(int v) {
		w = 0;
		if(v == N) {
			for(int i = 0 ; i < N;i++) {
				w += power[kit[i]];
				w -= K;
				if(w < 0)return;
			}
			res++;
			return;
		}
		
		for(int i = 0; i < N;i++) {
			if(visit[i]) continue;
			
			visit[i] = true;
			kit[i] = v;
			dfs(v+1);
			visit[i] = false;
		}
	}
}
