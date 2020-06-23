package Level2;

public class Solution_쇠막대기 {
	
	static String arrangement = "()(((()())(())()))(())";
	public static void main(String[] args) {
		int iron = 0;
		int answer = 0;
		
		for(int i = 0; i < arrangement.length();i++) {
			if(arrangement.charAt(i) == '(' && arrangement.charAt(i+1) == ')') {
				answer += iron;
				i++;
			}
			else if(arrangement.charAt(i) == '(')iron++;
			else if(arrangement.charAt(i) == ')') {
				answer++;
				iron--;
			}
		}
		System.out.println(answer);
	}

}
