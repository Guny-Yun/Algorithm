package Level2;

import java.util.Arrays;

public class Solution_구명보트 {
	static int[] people = {70,50,80,50};
	static int limit = 100;
	public static void main(String[] args) {
		Arrays.sort(people);
		int answer = 0;
		int tmp = limit;
		for(int i = 0 ; i < people.length;i++) {
			tmp -= people[i];
			answer ++;
			if(tmp <= 0) {
				tmp = limit;
			}
		}
		System.out.println(answer);
	}

}
