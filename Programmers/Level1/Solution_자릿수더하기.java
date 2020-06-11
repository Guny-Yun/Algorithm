package Level1;

public class Solution_자릿수더하기 {
	static int n = 99999999;
	public static void main(String[] args) {
		int answer = 0;
		
		while(n != 0) {
			answer += n % 10;
			n /= 10;
		}
		System.out.println(answer);
	}

}
