package Level2;

import java.util.Arrays;

public class Solution_구명보트 {
	static int[] people = {70,50,80,50};
	static int limit = 100;
	public static void main(String[] args) {
		Arrays.sort(people);
		int answer = 0;
		int light = 0;
		int heavy = people.length - 1;
		while(light <= heavy) {
			if(people[light] + people[heavy] <= limit) {
				light++;
			}
			heavy--;
			
			answer++;
		}
		
		System.out.println(answer);
	}

}
