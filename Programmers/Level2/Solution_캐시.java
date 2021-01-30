package Level2;

import java.util.LinkedList;

public class Solution_캐시 {
	static String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
	static int cacheSize = 3;
	public static void main(String[] args) {
		int answer = 0;
		
		if( cacheSize == 0 ) {
			answer = cities.length * 5;
			return;
		}
		LinkedList<String> cache = new LinkedList<>();
		for(int i = 0 ; i < cities.length; i++) {
			String tmp = cities[i].toUpperCase();
			
			if(cache.remove(tmp)) {
				cache.addFirst(tmp);
				answer += 1;
			}else {
				int curSize = cache.size();
				if(curSize == cacheSize) cache.pollLast();
				
				cache.addFirst(tmp);
				answer += 5;
			}
		}
		System.out.println(answer);
	}

}
