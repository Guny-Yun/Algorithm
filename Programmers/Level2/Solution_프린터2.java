package Level2;

import java.util.*;

public class Solution_프린터2 {
	public static void main(String[] args) {
//		int[] priorities = {1, 1, 9, 1, 1, 1};
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		System.out.println(solution(priorities, location));
	}
	static public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Task> q = new LinkedList<>();
		for(int i = 0 ; i < priorities.length;i++) {
			q.add(new Task(i, priorities[i]));
		}
		int cnt = 1;
		h:while(!q.isEmpty()) {
			for(int j = 1; j < q.size();j++) {
				if(q.peek().priority < q.get(j).priority) {
					q.addLast(q.pollFirst());
					continue h;
				}
			}
			Task tmp = q.pollFirst();
			if(tmp.loc == location) {
				answer = cnt;
				break;
			}
			cnt++;
		}
        return answer;
    }
	static class Task{
		int loc;
		int priority;
		public Task(int l, int p) {
			this.loc = l;
			this.priority = p;
		}
	}

}
