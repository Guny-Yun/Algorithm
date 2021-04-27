package Level1;

public class Solution_음양더하기 {
	static int[] absolutes = {};
	static boolean[] signs = {};
	public static void main(String[] args) {
		int answer = 0;
        int sum = 0;
        for(int i = 0 ; i < absolutes.length; i++){
            if(!signs[i])absolutes[i] *= -1;
            
            sum += absolutes[i];
        }
        answer = sum;
        System.out.println(answer);
	}
}
