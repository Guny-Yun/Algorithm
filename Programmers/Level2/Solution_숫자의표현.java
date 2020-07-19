package Level2;

public class Solution_숫자의표현 {
	static int n = 15;
	public static void main(String[] args) {
		int answer = 0;
		for(int i = 1 ; i <= n;i++) {
			int sum = 0;
			for(int j = i ; j <= n;j++) {
				sum+=j;
				if(sum == n) {
					answer++;
					break;
				}else if(sum > n)break;
			}
		}
		System.out.println(answer);
	}

}
