package Level2;

public class Solution_문자열압축 {
	static String s = "abcabcabcabcdededededede";
	public static void main(String[] args) {
//		if(s.length() == 1) return 1;
		int answer = s.length();
		for(int i = 1; i <= s.length()/2 ; i++) {
			String cur = "";
			String res = "";
			String next = "";
			int hit = 1;
			
			for(int j = 0; j <= s.length()/i; j++) {
				int start = j * i;
				int end = i * (j + 1) > s.length() ? s.length() : i * (j + 1);
				cur = next;
				next = s.substring(start,end);
				
				if(cur.equals(next)) {
					hit++;
				}else {
					res += (hit> 1 ? String.valueOf(hit) : "") + cur;
					hit = 1;
				}
			}
			res += (hit> 1 ? String.valueOf(hit) : "") + next;
			answer = Math.min(answer, res.length());
		}
		System.out.println(answer);
	}
}
