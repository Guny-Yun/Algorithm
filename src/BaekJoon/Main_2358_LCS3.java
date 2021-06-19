package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2358_LCS3 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		int[][][] dp = new int[a.length()+1][b.length() + 1][c.length() +1];
		
		for(int i =1 ; i <= a.length();i++) {
			char tmp1 = a.charAt(i-1);
			for(int j =1 ; j<= b.length();j++) {
				char tmp2 = b.charAt(j-1);
				
				for(int k = 1; k <=c.length();k++) {
					char tmp3 = c.charAt(k-1);
					
					if(tmp1 == tmp2 && tmp2== tmp3) {
						dp[i][j][k] = dp[i-1][j-1][k-1]+1;
					}else
						dp[i][j][k] = Math.max(dp[i-1][j][k], Math.max(dp[i][j-1][k], dp[i][j][k-1]));
				}
			}
		}
		System.out.println(dp[a.length()][b.length()][c.length()]);
	}
}
