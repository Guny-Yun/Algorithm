package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_17404_RGB거리2 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][3]; 
        int[][] dp = new int[n][3];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<3; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());            
            }
        }
        int pmax = 1000 * n + 1; 
        int ans = 1000001; 
        for(int k = 0; k<3; k++) {
            for(int i = 0; i<3; i++) {
                if(i==k) dp[0][i] = a[0][i]; 
                else dp[0][i] = pmax;
            }
            for(int i = 1; i<n; i++) {
                dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + a[i][0];
                dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + a[i][1];
                dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + a[i][2];
            }
            for(int i = 0; i<3; i++) {
                if(i==k) continue; 
                ans = Math.min(ans, dp[n-1][i]);
            }            
        }
        System.out.println(ans);        
	}
}
