package Level2;

public class Solution_JadenCase문자열만들기 {
	static String s = "3people unFollowed me   ";
	public static void main(String[] args) {
		String answer = "";
		String s2 = s.toLowerCase();
		String[] in_arr = s2.split(" ");
		
		for(int i = 0 ; i < in_arr.length;i++) {
			if(in_arr[i].length() >= 1){
				
				char[] tmp = in_arr[i].toCharArray();
				tmp[0] = Character.toUpperCase(tmp[0]);
				
				in_arr[i] = new String(tmp);
			}
		}
		answer = in_arr[0];
		for(int i = 1 ; i < in_arr.length;i++) {
			answer += " " + in_arr[i];
		}
		if(s.length() != answer.length()) {
			int cnt = s.length() - answer.length();
			for(int i = 0 ; i < cnt;i++) {
				answer += " ";
			}
		}
		System.out.println(answer);
	}

}
