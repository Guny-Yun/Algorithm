package Level2;

public class Solution_N진수게임 {

	public static void main(String[] args) {
		System.out.println(solution(16,16,2,2));
	}
	public static String solution(int n, int t, int m, int p) {
		StringBuilder answer = new StringBuilder("");
		StringBuilder biStr = new StringBuilder("0");
		String[] hex = {"A","B","C","D","E","F"};
		int num = 1;
		while(biStr.length() - 1 < t * m) {
			StringBuilder s = new StringBuilder("");
			int q = num;
			int r;
			
			while(q > 0) {
				r = q % n;
				q = q / n;
				
				if(r >= 10 && r <= 15) {
					s.append(hex[r - 10]);
				}else {
					s.append(r);
				}
			}
			biStr.append(s.reverse());
			num++;
		}
		int tube = p;
		for(int i = 0; i < t;i++) {
			answer.append(biStr.charAt(tube-1));
			tube += m;
		}
		return answer.toString();
	}
}
