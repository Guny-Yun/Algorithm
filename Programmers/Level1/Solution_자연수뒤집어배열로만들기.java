package Level1;

public class Solution_자연수뒤집어배열로만들기 {
	static int n = 12345;
	public static void main(String[] args) {
		int[] answer;
		String temp = "" + n;
		answer = new int[temp.length()];
		int cnt = 0;
		
		while(n > 0) {
			answer[cnt] = (int)(n%10);
			n/=10;
			cnt++;
		}
		for(int a : answer)System.out.print(a + " ");
	}

}
