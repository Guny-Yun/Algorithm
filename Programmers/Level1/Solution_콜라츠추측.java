package Level1;

public class Solution_콜라츠추측 {
	static int num = 1;
	public static void main(String[] args) {
int answer = 0;
		
		while(answer < 500) {
			if(num == 1)break;
			if(num % 2 == 0) {
				num = num/2;
			}
			else if(num % 2 == 1) {
				num = num * 3 + 1;
			}
			answer++;
		}
		if(answer == 500)answer = -1;
		System.out.println(answer);
	}

}
