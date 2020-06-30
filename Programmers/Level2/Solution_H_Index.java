package Level2;

import java.util.*;

public class Solution_H_Index {
	static int[] citations = {3,0,6,1,5};
	public static void main(String[] args) {
		int answer = 0;
		int h = 0;
		int tmp = 0;
		Arrays.sort(citations);
		
		for(int i = 0 ; i < citations.length;i++) {
			h = citations[i];
			tmp = citations.length - i;
			if(tmp <= h) {
				answer = tmp;
				break;
			}
		}
		System.out.println(answer);
	}

}
