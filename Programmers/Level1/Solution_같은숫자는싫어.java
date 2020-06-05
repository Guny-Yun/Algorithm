package Level1;

import java.util.*;

public class Solution_같은숫자는싫어 {
	static int[] arr = {1,1,3,3,0,1};
	public static void main(String[] args) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i = 1 ; i < arr.length;i++) {
			if(arr[i] != list.get(list.size()-1)) {
				list.add(arr[i]);
			}
			else continue;
		}
		answer = new int[list.size()];
		for(int i = 0 ; i < list.size();i++) {
			answer[i] = list.get(i);
		}
		for(int a: answer) {
			System.out.print(a + " ");
		}
	}
}
