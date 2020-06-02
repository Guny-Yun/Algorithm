package Level1;

import java.util.Arrays;

public class Solution_K번째수 {
	
	static int[] array = {1,5,2,6,3,7,4}; //입력 배열
	static int[][] commands = {{2,5,3},{4,4,1},{1,7,3}}; // i j k 배열
	
	public static void main(String[] args) {
		int[] answer = new int[commands.length];
		
		for(int i = 0 ; i < commands.length; i++) {
			int start = commands[i][0] -1;
			int end = commands[i][1];
			int k = commands[i][2] -1;
			
			int[] subarray = Arrays.copyOfRange(array, start, end);
			Arrays.sort(subarray);
			
			answer[i] = subarray[k];
		}
	}
}
