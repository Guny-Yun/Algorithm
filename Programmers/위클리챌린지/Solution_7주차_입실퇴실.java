package 위클리챌린지;

import java.util.ArrayList;
import java.util.List;

public class Solution_7주차_입실퇴실 {

	public static void main(String[] args) {
		int[] enter = {1,4,2,3};
		int[] leave = {2,1,4,3};
		solution(enter, leave);
	}
	public static int[] solution(int[] enter, int[] leave) {
		int[]answer = new int[enter.length];
		List<Integer> list = new ArrayList<>();
		int idx = 0;
		
		for(int i = 0 ; i < answer.length; i++) {
			list.add(enter[i]);
			for(int j = 0 ; j <list.size();j++) {
				if(enter[i] == list.get(j))
					answer[list.get(j)-1] = list.size()-1;
				else
					answer[list.get(j)-1]++;
			}
			while(idx < answer.length && list.contains(leave[idx]))
				list.remove(Integer.valueOf(leave[idx++]));
		}
		return answer;
	}
}
