package Level2;

import java.util.HashSet;

public class Solution_폰켓몬 {
	static int[] nums = {3,3,3,2,2,4};
	public static void main(String[] args) {
		int answer = 0;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0 ; i < nums.length;i++) {
			hs.add(nums[i]);
		}
		if(nums.length / 2 < hs.size())answer = nums.length/2;
		else answer = hs.size();
		
		System.out.println(answer);
	}

}
