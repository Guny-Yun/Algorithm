package NAVER;

import java.util.ArrayList;

public class Solution_3 {
	static String S = "aabbcc";
	static int[] C = {1,2,1,2,1,2};
	public static void main(String[] args) {
		int[] alpha = new int[26];
		int res = 0;
		boolean[] visit = new boolean[C.length];
		ArrayList<info> list = new ArrayList<>();
		
		for(int i = 0 ; i < C.length-1;i++) {
			if(S.charAt(i) == S.charAt(i+1)) {
				list.add(new info(i,C[i], S.charAt(i)));
			}
		}
		
		for(int i = 0; i < 26;i++) {
			
		}
		
		
	}
	static class info{
		int idx;
		int cost;
		char ch;
		
		public info(int idx, int cost, char ch) {
			this.idx = idx;
			this.ch = ch;
			this.cost = cost;
		}
	}

}
