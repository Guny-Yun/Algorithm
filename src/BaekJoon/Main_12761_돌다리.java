package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_12761_돌다리 {
	static int A, B, N, M;
	static int[] visit = new int[100001];
	static Queue<Integer> q;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		q = new LinkedList<>();
		q.add(N);
		visit[N] = 1;
		while (!q.isEmpty()) {
			N = q.poll();
			if (N == M) {
				break;
			}
			if (N + 1 <= 100000 && visit[N + 1] == 0) {
				q.add(N + 1);
				visit[N + 1] = visit[N] + 1;
			}
			if (N - 1 >= 0 && visit[N - 1] == 0) {
				q.add(N - 1);
				visit[N - 1] = visit[N] + 1;
			}
			if (N + A <= 100000 && visit[N + A] == 0) {
				q.add(N + A);
				visit[N + A] = visit[N] + 1;
			}
			if (N * A <= 100000 && visit[N * A] == 0) {
				q.add(N * A);
				visit[N * A] = visit[N] + 1;
			}
			if (N - A >= 0 && visit[N - A] == 0) {
				q.add(N - A);
				visit[N - A] = visit[N] + 1;
			}

			if (N + B <= 100000 && visit[N + B] == 0) {
				q.add(N + B);
				visit[N + B] = visit[N] + 1;
			}
			if (N - B >= 0 && visit[N - B] == 0) {
				q.add(N - B);
				visit[N - B] = visit[N] + 1;
			}
			if (N * B <= 100000 && visit[N * B] == 0) {
				q.add(N * B);
				visit[N * B] = visit[N] + 1;
			}
		}
		System.out.println(visit[M] - 1);
	}
}
