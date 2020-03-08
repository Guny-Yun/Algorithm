package SWEA;

import java.util.Arrays;

public class Solution_그래비티 {

	public static void main(String[] args) {
		int[] space = new int[5];
		for(int i = 0;i<space.length;i++) {
			space[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(space));
		/////////
		
		int res = 0;//낙차 크기
		int max = Integer.MIN_VALUE; //최대낙차 받을 변수
		for(int i = 0; i<space.length;i++) {
			res = space.length - i - 1; 
			for(int j = i+1;j<space.length;j++) {
				if(space[i]<= space[j]){
					res -= 1;
				}
			}
			max = Math.max(res, max);
		}
		System.out.println(max);
	}

}
