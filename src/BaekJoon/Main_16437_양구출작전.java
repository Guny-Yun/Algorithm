package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_16437_양구출작전 {
	static ArrayList<Integer>[] nodes;
	static int[] score;
	static char[] animal;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		nodes = new ArrayList[N + 1];
		animal = new char[N+1];
		score = new int[N+1];
		
		for(int i = 0 ; i < N +1 ;i++) {
			nodes[i] = new ArrayList<>();
		}
		for(int idx = 2; idx <= N; idx++) {
			st = new StringTokenizer(br.readLine());
			char node = st.nextToken().charAt(0);
			int amount = Integer.parseInt(st.nextToken());
			int next = Integer.parseInt(st.nextToken());
			animal[idx] = node;
			score[idx] = amount;
			nodes[next].add(idx);
		}
		
		System.out.println(post(1));
	}
	public static long post(int node) {
		long sum = 0;
		for(int next: nodes[node]) {
			sum += post(next);
		}
		
		if(animal[node] == 'S') {
			return sum +score[node];
		}else {
			return(sum - score[node] >= 0) ? sum - score[node]:0;
		}
	}
}
