package NAVER;

public class Solution_2 {
	static int N = -999;
	
	public static void main(String[] args) {
		char stand = '5';
		String s = String.valueOf(N);
		int idx = 0;
		if(N >= 0) {//양
			for(int i = 0 ; i < s.length();i++) {
				char tmp = s.charAt(i);
				if(stand >= tmp) {
					idx = i;
					break;
				}
			}
		}else {//음
			for(int i = 1 ; i < s.length();i++) {
				char tmp = s.charAt(i);
				if(stand < tmp) {
					idx = i;
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.insert(idx, "5");
		System.out.println(sb);
		int res = Integer.parseInt(sb.toString());
		
		
	}

}
