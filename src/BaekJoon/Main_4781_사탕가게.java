package BaekJoon;

import java.util.Scanner;

public class Main_4781_사탕가게 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N = sc.nextInt();
			int money = (int)Math.round(sc.nextDouble() * 100);
			if(N == 0 && money == 0)break;
			
			int[] dp = new int[10001];
			for(int i = 1 ; i <= N;i++) {
				int cal = sc.nextInt();
				int price = (int) Math.round(sc.nextDouble() * 100);
				for(int j = price ; j <= money;j++) {
					dp[j] = Math.max(dp[j], dp[j-price] + cal);
				}
			}
			System.out.println(dp[money]);
		}
	}
}
