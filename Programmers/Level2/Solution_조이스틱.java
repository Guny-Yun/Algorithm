package Level2;

public class Solution_조이스틱 {
	static String name = "JEROEN";
	public static void main(String[] args) {
		int answer = 0;

		int len = name.length();
		int min_move = len - 1;
		for (int i = 0; i < len; i++) {
			if (name.charAt(i) <= 'M')
				answer += name.charAt(i) - 'A';
			else
				answer += 'Z' - name.charAt(i) + 1;

			int next = i + 1;

			while (next < len && name.charAt(next) == 'A') {
				++next;
			}
			min_move = Math.min(min_move, i + len - next + Math.min(i, len - next));
		}
		answer += min_move;
		System.out.println(answer);
	}
}
