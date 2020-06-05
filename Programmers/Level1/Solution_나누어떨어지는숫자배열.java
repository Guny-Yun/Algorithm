package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_나누어떨어지는숫자배열 {
	static int[] arr = {5,9,7,10};
	static int divisor = 5;
	public static void main(String[] args) {
		int[] answer;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] % divisor == 0)list.add(arr[i]);
		}
		
		if(list.size() != 0) {
			answer = new int[list.size()];
			for(int i = 0 ; i < list.size();i++) {
				answer[i] = list.get(i);
			}
		}
		else {
			answer = new int[1];
			answer[0] = -1;
		}
		Arrays.sort(answer);

		for(int a : answer) {
			System.out.print(a + " ");
		}
		
	}

}
