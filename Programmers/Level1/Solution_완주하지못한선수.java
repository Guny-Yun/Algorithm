package Level1;

import java.util.HashMap;

public class Solution_완주하지못한선수 {
	static String[] participant;
	static String[] completion;
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		String answer = "";
		
		for(String person : completion) {
			map.put(person, map.getOrDefault(person, 0) +1);
		}
		for(String person : participant) {
			map.put(person, map.getOrDefault(person, 0) -1);
			
			if(map.get(person) < 0) {
				answer = person;
				break;
			}
		}
		System.out.println(answer);
	}

}
