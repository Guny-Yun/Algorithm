package Level2;

import java.util.*;

public class Solution_탑 {
	
	static int[] heights = {1,5,3,6,7,6,5};
	public static void main(String[] args) {
		int[] answer = new int[heights.length];
		Stack<Integer> st = new Stack<>();
		for(int i = 0 ; i < heights.length;i++) {
			st.push(heights[i]);
		}
		
		while(!st.isEmpty()) {
			int tmp = st.pop();
			for(int i = st.size();i>=0;i--) {
				if(tmp < heights[i]) {
					answer[st.size()] = i + 1;
					break;
				}
			}
		}
		
		for(int a : answer)System.out.print(a + " ");
		
	}

}
