package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_11279_최대힙 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i =0; i < N;i++) {
			int tmp = Integer.parseInt(br.readLine());
			
			if(tmp == 0) {
				if(pq.isEmpty()) {
					sb.append("0" + "\n");
				}else {
					sb.append(pq.poll() + "\n");
				}
			}else if(tmp > 0) {
				pq.offer(tmp);
			}
		}
		System.out.println(sb);
	}
}
