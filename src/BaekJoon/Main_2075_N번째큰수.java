package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_2075_N번째큰수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringTokenizer st;
		
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N;j++) {
				pq.offer(Integer.parseInt(st.nextToken()));
			}
		}
		int answer =0;
		for(int i = 0; i < N;i++) {
			answer = pq.poll();
		}
		System.out.println(answer);
	}
}
