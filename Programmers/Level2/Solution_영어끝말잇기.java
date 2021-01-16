package Level2;

import java.util.ArrayList;

public class Solution_영어끝말잇기 {
	static int n = 3;
	static String[] words = {"tank", "kick", "know", "wheel", "land", "dream","mother","robot"
			,"tank"};
	public static void main(String[] args) {
		int[] answer = new int[2];
		
		ArrayList<String> list = new ArrayList<>();
		list.add(words[0]);
		int num = 0;
		int order = 0;
		for(int i = 1; i < words.length;i++) {
			String tmp = words[i];
			if(list.get(i-1).charAt(list.get(i-1).length()-1) != tmp.charAt(0)) {
				num = (i % n) + 1;
				order = (i / n) + 1;
				break;
			}
			
			if(list.contains(tmp)) {
				num = (i % n) + 1;
				order = (i / n) + 1;
				break;
			}
			list.add(tmp);
		}
		answer[0] = num;
		answer[1] = order;
		System.out.println(answer[0] + " " + answer[1]);
	}

}
