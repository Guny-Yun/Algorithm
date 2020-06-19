package Level2;

import java.util.*;

public class Solution_기능개발 {
	static int[] progresses = { 93, 30, 55 };
	static int[] speeds = { 1, 30, 5 };

	public static void main(String[] args) {
		int[] answer = {};

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			int day = 0;
			while (true) {
				progresses[i] += speeds[i];
				day++;
				if (progresses[i] >= 100)
					break;
			}
			q.add(day);
		} // 기능별로 배포에 필요한 개발 일수를 큐(q)에 저장
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		int relCnt = 0;
		while (!q.isEmpty()) { // q에서 하나씩 빼면서 한번에 배포 가능한 기능 개수를 체크
			int tmp = q.poll();
			relCnt++;
			while(!q.isEmpty() && q.peek() <= tmp) {
				relCnt++;
				q.poll();
			}
			list.add(relCnt);
			relCnt = 0;
		}
		answer = new int[list.size()]; // answer 배열에 한 번에 배포 가능한 기능 수들을 복사
		for(int i = 0 ; i < list.size();i++) {
			answer[i] = list.get(i);
		}

		for(int a : answer)System.out.print(a + " ");
	}
}
