package Level1;

public class Solution_최대공약수와최소공배수 {
	static int n = 30;
	static int m = 6;
	public static void main(String[] args) {
		int[] answer = new int[2];
		int big,small;
		int q, r;// 몫 나머지
		if(n>= m) {
			big = n;
			small = m;
		}
		else {
			big = m;
			small = n;
		}
		while(true) {
			r = big % small;
			if(r == 0) {
				answer[0] = small;
				answer[1] = (n*m)/answer[0];
				break;
			}
			big = small;
			small = r;
		}
		System.out.println(answer[0] + " " +answer[1]);
	}

}
