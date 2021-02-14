package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_13549_숨바꼭질3 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		if(N >= K) {
			System.out.println(N-K);
			return;
		}
		
		int[] dist = new int[100001];
		Arrays.fill(dist, -1);
		dist[N] = 0;
		q.offer(N);
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			if(tmp == K) {
				System.out.println(dist[tmp]);
				return;
			}
			int idx = tmp * 2;
			while(idx <= 100000 && dist[idx] < 0) {
				dist[idx] = dist[tmp];
				q.offer(idx);
				idx *= 2;
			}
			for(int n : new int[] {tmp-1,tmp +1}) {
				if(n <0 || n > 100000 || dist[n] >= 0)continue;
				dist[n] = dist[tmp] + 1;
				q.offer(n);
			}
		}
	}

}
