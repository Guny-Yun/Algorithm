package Level1;

public class Solution_문자열내p와y의개수 {
	static String s = "pPppoooyYy";
	public static void main(String[] args) {
		boolean answer = true;
		
		String temp = s.toUpperCase();
		int p = 0;
		int y = 0;
		
		for(int i = 0 ; i < temp.length(); i++) {
			if(temp.charAt(i) == 'P')p++;
			else if(temp.charAt(i) == 'Y')y++;
		}
		if(p != y) answer = false;
		
		System.out.println(answer);
	}

}
