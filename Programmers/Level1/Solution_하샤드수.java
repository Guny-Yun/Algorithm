package Level1;

public class Solution_하샤드수 {
	static int x = 10;
	public static void main(String[] args) {
		boolean answer = true;
		int sum = 0;
		int tmp = x;
		while(tmp != 0) {
			sum += tmp % 10;
			tmp /= 10;
		}
		if(x%sum == 0)answer = true;
		else answer = false;
		
		System.out.println(answer);
	}

}
