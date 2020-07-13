package Level2;

public class Solution_다음큰숫자 {
	static int n = 78;
	public static void main(String[] args) {
		int answer = 0;
		String num = Integer.toBinaryString(n);
		int one_cnt =0;
		for(int i = 0; i < num.length();i++) {
			if(num.charAt(i) == '1')one_cnt++;
		}		
		
		while(true) {
			n++;
			String next_num = Integer.toBinaryString(n);
			int nn_one_cnt = 0;
			for(int i = 0; i < next_num.length();i++) {
				if(next_num.charAt(i) == '1')nn_one_cnt++;
			}
			if(one_cnt == nn_one_cnt) {
				answer = Integer.parseInt(next_num,2);
				break;
			}
			
		}
		System.out.println(answer);
	}

}
