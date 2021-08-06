package Level3;

public class Solution_2xn타일링 {

	public static void main(String[] args) {
		System.out.println(solution(4));
	}
	public static int solution(int n) {
        int answer = 1;
        int a = 1;
        for(int i =0 ; i < n-1;i++){
            int c = (a + answer) % 1000000007;
            a = answer;
            answer = c;
        }
        return answer;
    }
}
