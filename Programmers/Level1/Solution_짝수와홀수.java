package Level1;

public class Solution_짝수와홀수 {
	static int num = 43;
	public static void main(String[] args) {
		String answer = "";
		
		answer += (num % 2 == 0)? "Even" : "Odd";
				
		System.out.println(answer);
	}

}
