package Level2;

public class Solution_이진변환반복하기 {
	static String s = "1111111";
	public static void main(String[] args) {
		int[] answer = {};
		answer = new int[2];
		
		int cnt = 0;
		int zero_cnt = 0;
		
		while(!s.equals("1")) {
			int one_cnt = 0;
			for(int i = 0 ; i < s.length();i++) {
				if(s.charAt(i) == '1') one_cnt++;
				else zero_cnt++;
			}
			s = Integer.toBinaryString(one_cnt);
			cnt++;
		}
		answer[0] = cnt;
		answer[1] = zero_cnt;
		
		System.out.println(answer[0] + " " + answer[1]);
	}
}
