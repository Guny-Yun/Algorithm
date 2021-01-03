package Level2;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_튜플 {
	static String s;
	
	public static void main(String[] args) {
		int[] answer = {};
		String[] str = s.replaceAll("[{}]"," ").trim().split(" ,");
		answer = new int[str.length];
		HashSet<Integer> hs = new HashSet<>();
		Arrays.parallelSort(str, (a,b) -> (a.length() - b.length()));
		int i = 0;
		for(String tmp : str) {
			for(String st : tmp.split(",")) {
				int a = Integer.parseInt(st.trim());
				if(hs.contains(a)) continue;
				hs.add(a);
				answer[i++] = a;
			}
		}
	}
}
