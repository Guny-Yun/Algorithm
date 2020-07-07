package Level2;

import java.util.HashMap;

public class Solution_위장 {
	static String[][] clothes = {{"yellow_hat","headgear"}, {"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
	public static void main(String[] args) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String[] clo : clothes) {
			map.put(clo[1], map.getOrDefault(clo[1], 0) + 1);
		}
		for(String key : map.keySet()) {
			answer *= map.get(key) + 1;
		}
		answer -= 1;
		System.out.println(answer);
	}

}
