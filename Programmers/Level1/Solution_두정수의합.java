package Level1;

public class Solution_두정수의합 {
	static int a = 2, b = 5;
	public static void main(String[] args) {
		long answer = 0;
		
		if(a > b)
			for(int i = a; i >= b; i--)answer += i;
		else for(int i = a; i <=b; i++)answer += i;
		
		System.out.println(answer);
	}

}
