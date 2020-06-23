package Level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution_프린터 {
	
	
	static int[] priorities = {1, 1, 9, 1, 1, 1};
	static int location = 0;
	public static void main(String[] args) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int tmp : priorities) pq.offer(tmp);
		
		while(!pq.isEmpty()) {
			for(int i = 0 ; i < priorities.length;i++) {
				if(pq.peek() == priorities[i]) {
					pq.poll();
					answer++;
					
					if(location == i) {
						pq.clear();
						break;
					}
				}
			}
		}
		System.out.println(answer);
		
	}

}
