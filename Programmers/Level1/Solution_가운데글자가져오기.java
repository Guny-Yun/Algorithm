package programmers;

public class Solution_가운데글자가져오기 {
	static String s = "abcdef";
	public static void main(String[] args) {
		String answer = "";
		int n = s.length();
		
		if(n%2 == 0) {//짝수면
			answer = s.substring(n/2-1,n/2+1);
		}
		else {//홀수면
			answer = ""+s.charAt(n/2); 
		}
		System.out.println(answer);
	}

}
