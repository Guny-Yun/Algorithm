package Level3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_이중우선순위큐 {

	public static void main(String[] args) {
		String[] operations = {"I 7","I 5","I -5","D -1"};
		
		System.out.println(solution(operations));
		
	}
	static public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> max_h = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> min_h = new PriorityQueue<>();
        for(int i = 0 ; i < operations.length; i++){
            String[] comm = operations[i].split(" ");
            if(comm[0].equals("I")){
                max_h.add(Integer.parseInt(comm[1]));
                min_h.add(Integer.parseInt(comm[1]));
            }
            
            if(comm[0].equals("D")){
                if(!max_h.isEmpty()){
                	if(comm[1].equals("1")) {
                		int max = max_h.peek();
                        max_h.remove(max);
                        min_h.remove(max);
                	}else{
                        int min = min_h.peek();
                        max_h.remove(min);
                        min_h.remove(min);
                    }
                }
            }
        }
        if(!max_h.isEmpty()){
            answer[0] = max_h.peek();
            answer[1] = min_h.peek();
        }
        return answer;
    }

}
