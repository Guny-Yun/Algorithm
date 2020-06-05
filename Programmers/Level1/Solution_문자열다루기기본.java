package Level1;

public class Solution_문자열다루기기본 {
	static String s = "1234";
	public static void main(String[] args) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				int tmp = Integer.parseInt(s);
				System.out.println("TRUE");
				return;
			} catch (NumberFormatException e) {
				System.out.println("FALSE");
				return;
			}
		} else
			System.out.println("FALSE");
	}
}
