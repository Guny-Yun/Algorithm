package Level2;

public class Solution_피보나치수 {
	static int n  = 5;
	public static void main(String[] args) {
		int answer = 0;
		int a = 0;
		int b = 1;
		for(int i = 0; i < n;i++) {
			int tmp = (a + b) % 1234567;
			a = b % 1234567;
			b = tmp % 1234567;
		}
		answer = a;
		System.out.println(answer);
	}

}
