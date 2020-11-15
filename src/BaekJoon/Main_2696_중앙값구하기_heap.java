package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_2696_중앙값구하기_heap {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			PriorityQueue<Integer> maxh = new PriorityQueue<>(Comparator.reverseOrder());
			PriorityQueue<Integer> minh = new PriorityQueue<>();
			sb.append((N + 1) / 2 + "\n");

			int cnt = 0;

			for (int i = 0; i < N; i++) {
				if (i % 10 == 0) {
					st = new StringTokenizer(br.readLine());
				}
				int tmp = Integer.parseInt(st.nextToken());

				if (maxh.size() == minh.size()) {
					maxh.offer(tmp);
				} else {
					minh.offer(tmp);
				}

				if (!minh.isEmpty()) {
					if (maxh.peek() > minh.peek()) {
						int max = maxh.poll();
						int min = minh.poll();
						maxh.offer(min);
						minh.offer(max);
					}
				}
				if (i % 2 == 0) {
					if (cnt == 9 || i == N - 1) {
						sb.append(maxh.peek() + "\n");
						cnt = 0;
					} else {
						sb.append(maxh.peek() + " ");
					}
					cnt++;
				}
			}

		}
		System.out.println(sb);
	}
}
