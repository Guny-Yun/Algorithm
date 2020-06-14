package Level1;

public class Solution_x만큼간격이있는n개의숫자 {
	static long x = -4;
	static int n = 2;
	public static void main(String[] args) {
		long[] answer = new long[n];
		
		for(int i = 0 ; i < n; i++) {
			answer[i] = x + x * i;
		}
		
		for(long a : answer)System.out.print(a + " ");
	}

}
