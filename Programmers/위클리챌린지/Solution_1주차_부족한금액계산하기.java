package 위클리챌린지;

public class Solution_1주차_부족한금액계산하기 {

	public static void main(String[] args) {
		System.out.println(solution(3,20,4));
	}
	public static long solution(int price, int money, int count) {
		long answer = -1;
        long need = 0;
        for(int i = 1; i <= count; i++){
            need += price * i;
        }
        long res = need - money;
        
        if(res > 0) answer = res;
        else answer = 0;
        return answer;
	}
}
