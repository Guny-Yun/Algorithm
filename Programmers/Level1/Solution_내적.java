package Level1;

public class Solution_내적 {
	static int[] a = {1,2,3,4};
	static int[] b = {-3,-1,0,2};
	public static void main(String[] args) {
		int answer = 0;
		for(int i = 0 ; i < a.length;i++) {
			answer = answer + a[i] * b[i];
		}
		System.out.println(answer);
	}

}
