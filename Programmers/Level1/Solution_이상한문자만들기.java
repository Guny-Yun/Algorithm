package Level1;

public class Solution_이상한문자만들기 {
	static String s = "try hello world    aaa";

	public static void main(String[] args) {
		String answer = "";
		int cnt = 0;
		String[] input = s.split("");

		for (int i = 0; i < input.length; i++) {
			if (input[i].equals(" ")) {
				cnt = 0;
			} else {
				if (cnt % 2 == 0) {
					cnt++;
					input[i] = input[i].toUpperCase();
				} else {
					cnt++;
					input[i] = input[i].toLowerCase();
				}
			}
			answer += input[i];
		}
		System.out.println(answer);
	}

}
