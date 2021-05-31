package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_13975_파일합치기3 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int tc = 1; tc<= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			st=  new StringTokenizer(br.readLine());
			PriorityQueue<Long> pq = new PriorityQueue<>();
			for(int i = 0 ; i < N;i++)pq.add(Long.parseLong(st.nextToken()));
			
			long sum = 0;
			while(pq.size() > 1) {
				long a = pq.poll();
				long b = pq.poll();
				sum += a + b;
				pq.add(a+b);
			}
			sb.append(sum);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
