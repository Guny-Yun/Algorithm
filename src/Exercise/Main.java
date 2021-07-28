package Exercise;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
	static int[] A = { -1, 1, 3, 3, 3, 2, 3, 2, 1, 0 };

	public static void main(String[] args) {
		int answer = 0;
        Deque<Integer> q = new LinkedList<>();
        int diff = 0;
        for(int i = 0 ; i < A.length;i++){
            int val = A[i];
            if(q.size() < 2){
                q.add(val);
            }
            else{
                if(q.size() == 2){
                    diff = q.getLast() - q.getFirst();
                }
                int d = val - q.getLast();
                if(diff == d){
                    q.addLast(val);
                    if(q.size() >= 3) ++answer;
                }else{
                    while(q.size() >1){
                        q.poll();
                        if(q.size() >= 3)++answer;
                    }
                    q.add(val);
                    diff = val - q.getFirst();
                }
                
            }
        }
        while(q.size() > 3){
            q.pollFirst();
            if(q.size() >= 3)++answer;
        }

		System.out.println(answer);
	}

}
