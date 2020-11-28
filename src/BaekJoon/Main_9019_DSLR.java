package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_9019_DSLR {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int tc = 1; tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			String[] comm = new String[10001];
			boolean[] visit = new boolean[10001];
			Queue<Integer> q = new LinkedList<>();
			visit[N] = true;
			q.add(N);
			Arrays.fill(comm, "");
			
			while(!q.isEmpty() && !visit[M]) {
				int tmp = q.poll();
				int D = (2 * tmp) % 10000;
				int S = (tmp == 0) ? 9999 : tmp-1;
				int L = (tmp % 1000) * 10 + tmp/1000;
				int R = (tmp % 10) * 1000 + tmp / 10;
				
				if(!visit[D]) {
					q.add(D);
					visit[D] = true;
					comm[D] = comm[tmp] + "D";
				}
				if(!visit[S]) {
					q.add(S);
					visit[S] = true;
					comm[S] = comm[tmp] + "S";
				}
				if(!visit[L]) {
					q.add(L);
					visit[L] = true;
					comm[L] = comm[tmp] + "L";
				}
				if(!visit[R]) {
					q.add(R);
					visit[R] = true;
					comm[R] = comm[tmp] + "R";
				}
				
			}
			sb.append(comm[M] + "\n");
		}
		System.out.println(sb);
	}
}
