package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2511_암호코드 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int[] dp = new int[in.length()+1];
		dp[0] = 1;
		dp[1] = 1;

		if (in.charAt(0) == '0') {
			System.out.println(0);
			return;
		}
		for(int i =1 ; i< in.length(); i++) {
			char tmp = in.charAt(i-1);
			if(in.charAt(i) >='1' && in.charAt(i) <='9') {
				dp[i+1] += dp[i];
				dp[i+1] %= 1000000;
			}
			if(!(tmp == '0' || tmp > '2' || (tmp == '2' && in.charAt(i) >'6'))) {
				dp[i+1] += dp[i-1];
				dp[i+1] %= 1000000;
			}
			dp[i + 1] %= 1000000000;
		}
		System.out.println(dp[in.length()]%1000000000);
	}
}
