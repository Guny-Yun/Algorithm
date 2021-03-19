package Level2;

public class Solution_점프와순간이동 {
	static int N = 5000;
	public static void main(String[] args) {
		int answer =0;
		
		while(N != 0) {
			if(N % 2 == 0) {
				N /= 2;
			}else {
				N--;
				answer++;
			}
		}
		System.out.println(answer);
	}

}
