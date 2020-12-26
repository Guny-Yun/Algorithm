package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_1043_거짓말 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st=  new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> party[] = new ArrayList[M+1];
		for(int i = 0 ; i <= M;i++) party[i] = new ArrayList<>();
		
		ArrayList<Integer> people[] = new ArrayList[N+1];
		for(int i = 0 ; i <= N; i++)people[i] = new ArrayList<>();
		
		ArrayList<Integer> truth = new ArrayList<>();
		boolean[] visit = new boolean[M+1];
		
		for(int i = 0 ; i < K;i++) {
			truth.add(Integer.parseInt(st.nextToken()));
		}
		for(int i = 0 ; i < M;i++) {
			st = new StringTokenizer(br.readLine());
			int tmp = Integer.parseInt(st.nextToken());
			for(int j = 0 ; j < tmp; j++) {
				int tmp2 = Integer.parseInt(st.nextToken());
				party[i].add(tmp2);
				people[tmp2].add(i);
			}
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0 ; i < truth.size();i++) {
			for(int j = 0 ; j < people[truth.get(i)].size();j++) {
				if(!visit[people[truth.get(i)].get(j)]) {
					visit[people[truth.get(i)].get(j)] = true;
					q.add(people[truth.get(i)].get(j));
				}
			}
		}
		while(!q.isEmpty()) {
			int tmp = q.poll();
			for(int i = 0 ; i < party[tmp].size();i++) {
				for(int j = 0 ; j < people[party[tmp].get(i)].size();j++) {
					if(!visit[people[party[tmp].get(i)].get(j)]) {
						visit[people[party[tmp].get(i)].get(j)] = true;
						q.add(people[party[tmp].get(i)].get(j));
					}
				}
			}
		}
		int answer = 0;
		for(int i = 0 ; i < M;i++) {
			if(!visit[i]) answer++;
		}
		System.out.println(answer);
	}
}
