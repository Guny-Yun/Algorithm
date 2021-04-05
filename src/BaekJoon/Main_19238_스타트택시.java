package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_19238_스타트택시 {
	static int N, M, fuel;
	static int[][] map;
	static Map<Integer, Person> hm = new HashMap<>();
	static Person cur;
	static Taxi taxi;
	static final int[] di = {-1,1,0,0};
	static final int[] dj = {0,0,-1,1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		fuel = Integer.parseInt(st.nextToken());
		map = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		taxi = new Taxi(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			Person p = new Person(i + 2, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			hm.put(p.id, p);
			map[p.si][p.sj] = p.id;
		}// Input
		
		while(!hm.isEmpty()) {
			int curFuel = bfs();
			fuel -= curFuel;
			if(fuel < 0) break;
			
			int useFuel = bfs();
			fuel -= useFuel;
			if(fuel < 0) break;
			
			fuel += useFuel * 2;
		}
		System.out.println(fuel < 0 ? -1 : fuel);
	}
	
	public static int bfs() {
		Queue<Taxi> tq = new LinkedList<>();
		Queue<Person> pq = new LinkedList<>();
		boolean[][] visit = new boolean[N+1][N+1];
		
		int prevMove = taxi.move;
		visit[taxi.i][taxi.j] = true;
		tq.add(taxi);
		
		while(!tq.isEmpty()) {
			Taxi now = tq.poll();
			
			if(fuel - now.move < 0)return Integer.MAX_VALUE;
			
			if(prevMove != now.move && !pq.isEmpty()) break;
			
			prevMove = now.move;
			
			if(cur == null) {
				int id = map[now.i][now.j];
				
				if(id > 1) {
					Person p = hm.get(id);
					pq.add(p);
				}
			}else {
				if(now.i == cur.ei && now.j == cur.ej) {
					hm.remove(cur.id);
					cur = null;
					taxi = new Taxi(now.i, now.j, 0);
					return prevMove;
				}
			}
			for(int k = 0 ; k <4;k++) {
				int ni = now.i + di[k];
				int nj = now.j + dj[k];
				if(0 <ni && ni < N+1 && 0 < nj && nj < N+1) {
					if(map[ni][nj] != 1 && !visit[ni][nj]) {
						tq.add(new Taxi(ni,nj,now.move+1));
						visit[ni][nj] = true;
					}
				}
			}
		}
		if(pq.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		cur = findNear(pq);
		taxi = new Taxi(cur.si, cur.sj, 0);
		map[cur.si][cur.sj] = 0;
		return prevMove;
	}
	public static Person findNear(Queue<Person> q) {
		Person tar = q.poll();
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			if(tmp.si < tar.si) {
				tar = tmp;
			}else if(tmp.si == tar.si && tmp.sj < tar.sj) {
				tar = tmp;
			}
		}
		return tar;
	}
	

	static class Taxi {
		int i, j, move;

		public Taxi(int i, int j, int move) {
			this.i = i;
			this.j = j;
			this.move = move;
		}
	}

	static class Person {
		int id, si, sj, ei, ej;

		Person(int id, int si, int sj, int ei, int ej) {
			this.id = id;
			this.si = si;
			this.sj = sj;
			this.ei = ei;
			this.ej = ej;
		}
	}
}
