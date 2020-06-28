package Level2;

import java.util.PriorityQueue;

public class Solution_더맵게 {
	static int[] scoville = {1,2,3,9,10,12};
	static int K = 7;
	public static void main(String[] args) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int a : scoville)pq.offer(a);
		while(pq.peek() <= K) {
			if(pq.size() == 1) {
//				return -1;
			}
			int tmp1 = pq.poll();
			int tmp2 = pq.poll();
			
			int res = tmp1 + (tmp2 * 2);
			pq.offer(res);
			answer++;
		}
		System.out.println(answer);
	}

}
