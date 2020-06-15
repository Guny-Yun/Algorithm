package Level1;

import java.util.Arrays;

public class Solution_예산 {
	static int[] d = {1,3,2,5,4};
	static int budget = 9;
	public static void main(String[] args) {
		int answer = 0;
		
		Arrays.sort(d);
		for(int i = 0 ; i < d.length;i++) {
			budget -= d[i];
			if(budget < 0)break;
			answer++;
		}
		System.out.println(answer);
	}

}
