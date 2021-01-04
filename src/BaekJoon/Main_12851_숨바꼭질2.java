package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_12851_숨바꼭질2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		boolean[] visit = new boolean[100001];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {N,0});
		visit[N] = true;
		
		int[] next = new int[3];
		int time = Integer.MAX_VALUE;
		int cnt = 0;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			
			if(now[1] > time) {
				continue;
			}else if(now[0] == K) {
				if(time > now[1]) {
					time = now[1];
					cnt = 1;
				}else if(time == now[1])cnt++;
			}
			visit[now[0]] = true;
			next[0] = now[0] -1;
			next[1] = now[0] + 1;
			next[2] = now[0] << 1;
			
			for(int i = 0 ; i < 3;i++) {
				if(0 <= next[i] && next[i] <= 100000 && !visit[next[i]]) {
					q.add(new int[] {next[i], now[1]+1});
				}
			}
		}
		System.out.println(time);
		System.out.println(cnt);
		
		
	}

}
