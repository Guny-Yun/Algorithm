package Level1;

public class Solution_시저암호 {
	static String s = "a B z";
	static int n = 4;
	public static void main(String[] args) {
		String answer = "";
		char[] lower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] upper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		for(int i = 0 ; i < s.length();i++) {
			if(s.charAt(i) != ' ') {
				for(int j = 0; j < 26; j++) {
					if(s.charAt(i) == lower[j]) {
						answer += lower[(j+n)%26];
						continue;
					}else if(s.charAt(i) == upper[j]){
						answer += upper[(j+n)%26];
						continue;
					}
				}
			}else answer += " ";
		}
		
		System.out.println(answer);
	}

}
