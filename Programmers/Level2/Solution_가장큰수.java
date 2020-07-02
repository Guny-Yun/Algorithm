package Level2;

import java.util.Arrays;

public class Solution_가장큰수 {
	static int[] numbers = {3,30,34,5,9};
	public static void main(String[] args) {
		String answer = "";
		String[] input = new String[numbers.length];
		for(int i = 0; i < numbers.length;i++)input[i] = String.valueOf(numbers[i]);
		
		Arrays.sort(input, (o1, o2)->(o2 + o1).compareTo(o1+o2));
		
		if(input[0].equals("0")) {
//			return "0";
			return;
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < input.length;i++) {
			sb.append(input[i]);
		}
		answer = sb.toString();
		System.out.println(answer);
	}

}
