package Level2;

public class Solution_큰수만들기 {
	static String number = "4177252841";
	static int k = 4;
	public static void main(String[] args) {
		StringBuilder sb  = new StringBuilder();
		int idx = 0;
		char max;
		
		for(int i = 0 ; i < number.length() - k; i++) {
			max = '0';
			for(int j = idx;j <= k + i; j++) {
				if(max < number.charAt(j)) {
					max = number.charAt(j);
					idx = j+1;
				}
			}
			sb.append(max);
		}
		System.out.println(sb.toString());
	}

}
