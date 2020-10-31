import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1699_제곱수의합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[100001];
		dp[1] = 1;
		for(int i = 2; i <= N;i++) {
			dp[i] = i;
			for(int j = 1; j*j <= i;j++) {
				dp[i] = Math.min(dp[i-(j*j)] + 1, dp[i]);
			}
		}
		System.out.println(dp[N]);
	}
}
