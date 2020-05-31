package Level1;

import java.util.*;

public class Solution_모의고사 {
	static int[] answer; //리턴 값
	static int[] answers; // 정답
	public static void main(String[] args) {
		int[] one = {1,2,3,4,5};
		int[] two = {2,1,2,3,2,4,2,5};
		int[] thr = {3,3,1,1,2,2,4,4,5,5};
		int cor1 = 0, cor2 = 0, cor3 = 0;
        
		for(int i = 0 ; i < answers.length; i++) {
			if(one[i % 5] == answers[i])cor1++;
			if(two[i % 8] == answers[i])cor2++;
			if(thr[i % 10] == answers[i])cor3++;
		}
		int win = Math.max(Math.max(cor1, cor2),cor3);
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(win == cor1) res.add(1);
        if(win == cor2) res.add(2);
        if(win == cor3) res.add(3);
        
		answer = new int[res.size()];
		for(int i = 0 ; i < answer.length;i++) {
			answer[i] = res.get(i);
		}
		
	}

}
