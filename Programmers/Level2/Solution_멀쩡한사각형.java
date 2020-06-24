package Level2;

public class Solution_멀쩡한사각형 {
	static int w = 8;
	static int h = 12;
	public static void main(String[] args) {
		long answer = 0;
		for(int i = 0 ; i < w;i++) {
			answer += (Long.valueOf(h) * i)/Long.valueOf(w);
		}
		answer *= 2;
		System.out.println(answer);
	}

}
