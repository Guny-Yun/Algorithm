package Level1;
import java.util.*;
public class Solution_정수제곱근판별 {
	static int n = 121;
	public static void main(String[] args) {
		long answer = 0;
		
		double sqrt = Math.sqrt(n);
		if(Math.pow((int)sqrt, 2) == n) answer = (long) Math.pow(sqrt+1, 2);
		else answer = -1;
		
		
		System.out.println(answer);
	}

}
