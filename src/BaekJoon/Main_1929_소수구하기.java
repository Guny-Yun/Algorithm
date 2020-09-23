package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1929_소수구하기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		List<Boolean> list = new ArrayList<>();
		list.add(false); // 0
		list.add(false); // 1
		for (int i = 2; i <= N; i++) {
			list.add(i, true);
		}

		for (int i = 2; (i * i) <= N; i++) {
			if (list.get(i))
				for (int j = i * i; j <= N; j+=i) {
					list.set(j, false);
				}
		}
		for (int i = M; i <= N; i++) {
			if (list.get(i))
				System.out.println(i);
		}
	}
}
