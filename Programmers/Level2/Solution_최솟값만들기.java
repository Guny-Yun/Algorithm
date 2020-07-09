package Level2;

import java.util.Arrays;

public class Solution_최솟값만들기 {
	static int[] A = {1,4,2};
	static int[] B = {5,4,4};
	public static void main(String[] args) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i = 0 ; i < A.length;i++) {
			answer += A[i] * B[B.length-1-i];
		}
		
		System.out.println(answer);
	}

}
