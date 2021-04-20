package Level2;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution_압축 {
	static String msg = "KAKAO";

	public static void main(String[] args) {
		ArrayList<Integer> ans = new ArrayList<>();
		int idx = 1;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (char i = 'A'; i <= 'Z'; i++) {
			hm.put(i + "", idx++);
		}

		int size = msg.length();
		for (int i = 0; i < size; i++) {
			int a = 1;
			while (i + a <= size && hm.containsKey(msg.substring(i, i + a))) {
				a++;
			}
			if (i + a > size) {
				ans.add(hm.get(msg.substring(i)));
				break;
			}
			ans.add(hm.get(msg.substring(i, i + a - 1)));

			hm.put(msg.substring(i, i + a), idx++);
			if (a > 1)
				i += a - 2;

		}
		int[] answer = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			answer[i] = ans.get(i);
		}
		for (int a : answer) {
			System.out.print(a + " ");
		}
	}
}
