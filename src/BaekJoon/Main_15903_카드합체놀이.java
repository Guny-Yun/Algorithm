package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_15903_카드합체놀이 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			pq.add(Long.parseLong(st.nextToken()));
		}
		
		while(M>0) {
			long tmp = pq.poll();
			tmp += pq.poll();
			pq.add(tmp);
			pq.add(tmp);
			M--;
		}
		long answer = 0;
		while(!pq.isEmpty()) answer += pq.poll();
		
		System.out.println(answer);
	}
}
