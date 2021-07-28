package Ebay;


public class Solution_2 {
	static int num = 8;
	static int[] cards = {1,4,6};
	public static void main(String[] args)  {
		int dp[] = new int[num+1];
		int answer = 0;
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] > num)
				continue;
			dp[cards[i]] = 1;
		}
		for (int i = 1; i <= num; i++) {
			int min = Integer.MAX_VALUE -1;
			for (int j = 0; j < cards.length; j++) {
				if (cards[j] > i)
					continue;
				if (min > dp[i - cards[j]]) {
					min = dp[i - cards[j]];
				}
			}
			dp[i] = min + 1;
		}
		if (dp[num] == Integer.MAX_VALUE)
			answer = -1;
		else
			answer =dp[num];
		System.out.println(answer);
	}
}