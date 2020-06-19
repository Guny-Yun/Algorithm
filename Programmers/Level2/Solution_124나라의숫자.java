package Level2;

public class Solution_124나라의숫자 {
	static int n = 231;
	public static void main(String[] args) {
		String answer = "";
		
		int r = 0;
		
		while(n>0) {
			r = n % 3;
			n /= 3;
			if(r == 0) {
				r = 4;
				n -= 1;
			}
			answer = r + answer;
		}
		
		System.out.println(answer);
	}

}
