package Level1;

public class Solution_수박수박수박수박수박수 {
	static int n = 4;
	public static void main(String[] args) {
		String answer = "";
		for(int i = 0;i<n;i++) {
			answer += (i%2 != 0)? "박" : "수";
		}
		System.out.println(answer);
	}

}
