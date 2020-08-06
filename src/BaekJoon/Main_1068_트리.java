package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1068_트리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] parent = new int[n];
		int[] child = new int[n];
		boolean[] visit = new boolean[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			parent[i] = Integer.parseInt(st.nextToken());
			if (parent[i] != -1) child[parent[i]]++;
		}

		Queue<Integer> q = new LinkedList<>();
		int del = Integer.parseInt(br.readLine()); // 삭제
		
		visit[del] = true;
		q.add(del);
		if (parent[del] != -1)
			child[parent[del]]--;

		while (!q.isEmpty()) {
			int poll = q.poll();
			for (int i = 0; i < n; i++) {
				if (parent[i] == poll && !visit[i]) {
					visit[i] = true;
					q.add(i);
					child[poll]--;
				}
			}
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (!visit[i] && child[i] == 0)
				res++;
		}
		System.out.println(res);
	}
}
