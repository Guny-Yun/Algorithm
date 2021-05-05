package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_타겟넘버_bfs {
	static int[] numbers = { 1, 1, 1, 1, 1 };
	static int target = 3;

	public static void main(String[] args) {
		System.out.println(solution(numbers, target));
	}
	public static int solution(int[] numbers, int target) {
        int answer = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {numbers[0], 0});
        q.offer(new int[] {-numbers[0], 0});
        
        while(!q.isEmpty()) {
        	int[] tmp = q.poll();
        	
        	if(tmp[1] == numbers.length-1) {
        		if(tmp[0] == target) {
        			answer++;
        		}
        		continue;
        	}
        	int cur1 = tmp[0] + numbers[tmp[1] + 1];
        	int cur2 = tmp[0] - numbers[tmp[1] + 1];
        	
        	q.add(new int[] {cur1, tmp[1]+1});
        	q.add(new int[] {cur2, tmp[1]+1});
        }
   
        return answer;
    }
	
    

}
