package Level1;

public class Solution_약수의합 {
	static int n = 12;

	public static void main(String[] args) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				answer += i;
		}
		System.out.println(answer);

	}

}
