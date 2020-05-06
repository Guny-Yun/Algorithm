package BaekJoon;

import java.io.*;
import java.util.*;


public class Main_15686_치킨배달 {
	
	static class Position {
		public int r;
		public int c;

		public Position(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	static int N, M, res;
	static ArrayList<Position> homes;
	static ArrayList<Position> chikens;
	static Stack<Position> select;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		homes = new ArrayList<>();
		chikens = new ArrayList<>();
		select = new Stack<>();
		res = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp == 1) {
					homes.add(new Position(i, j));
				} else if (tmp == 2) {
					chikens.add(new Position(i, j));
				}
			}
		} // 입력 끝

		comb(0, 0);
		System.out.println(res);

	}

	public static void comb(int start, int count) {
		if (count == M) {
			calcDist();
			return;
		}

		for (int i = start; i < chikens.size(); i++) {
			select.push(chikens.get(i));
			comb(i + 1, count + 1);
			select.pop();
		}
	}

	public static void calcDist() {
		int sum = 0;
		for (int i = 0; i < homes.size(); i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < select.size(); j++) {
				int dist = Math.abs(select.get(j).r - homes.get(i).r) + Math.abs(select.get(j).c - homes.get(i).c);
				min = Math.min(min, dist);
			}
			sum += min;

			if (sum >= res)
				return;
		}
		res = Math.min(sum, res);
	}
}
