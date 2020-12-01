package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_7662_이중우선순위큐 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		TreeMap<Long, Long> tm;

		for (int tc = 1; tc <= T; tc++) {
			tm = new TreeMap<>();
			st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				char ch = st.nextToken().charAt(0);
				long N = Long.parseLong(st.nextToken());

				if (ch == 'I') {
					if (tm.containsKey(N)) {
						tm.put(N, tm.get(N) + 1);
					} else {
						tm.put(N, 1L);
					}
				} else if (ch == 'D') {
					if (tm.isEmpty())
						continue;

					if (N == -1) {
						long min = tm.firstKey();
						long next = tm.get(min) - 1;
						if (next == 0) {
							tm.remove(min);
						} else {
							tm.put(min, next);
						}
					} else if (N == 1) {
						long max = tm.lastKey();
						long next = tm.get(max) - 1;
						if (next == 0) {
							tm.remove(max);
						} else {
							tm.put(max, next);
						}
					}
				}
			}
			if (tm.isEmpty()) {
				System.out.println("EMPTY");
			} else {
				System.out.println(tm.lastKey() + " " + tm.firstKey());
			}
		}
	}
}
