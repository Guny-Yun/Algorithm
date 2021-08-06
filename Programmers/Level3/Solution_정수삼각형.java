package Level3;

public class Solution_정수삼각형 {

	public static void main(String[] args) {
		int[][] triangle = {};
		System.out.println(solution(triangle));
	}
	public static int solution(int[][] triangle) {
		int[][] dp = new int[triangle.length][triangle.length];
		dp[0][0] = triangle[0][0];
		for(int i = 1 ; i <triangle.length;i++) {
			dp[i][0] = triangle[i][0] + dp[i - 1][0];
			
			for(int j = 1;j < i+1;j++) {
				dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j-1], dp[i-1][j]);
			}
		}
		int answer =0;
		for(int i = 0 ; i <dp[dp.length-1].length;i++) {
			answer = Math.max(dp[dp.length-1][i], answer);
		}
		return answer;
	}
}	
