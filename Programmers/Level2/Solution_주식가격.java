package Level2;

public class Solution_주식가격 {
	static int[] prices = {1,2,3,2,3};
	public static void main(String[] args) {
		int[] answer = new int[prices.length];
		for(int i = 0 ; i < prices.length;i++) {
			int second = 0;
			for(int j = i + 1; j < prices.length;j++) {
				second++;
				if(prices[i] > prices[j])break;
			}
			answer[i] = second;
		}
		for(int a : answer)System.out.print(a + " ");
	}

}
