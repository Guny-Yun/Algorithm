package 위클리챌린지;

public class Solution_8주차_최소직사각형 {

	public static void main(String[] args) {
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		System.out.println(solution(sizes));
	}
	public static int solution(int[][] sizes) {
		int answer = 0;
		int v = 0;
		int h = 0;
		for(int i = 0 ; i < sizes.length;i++) {
			if(sizes[i][0] >= sizes[i][1]) {
				h = Math.max(sizes[i][0], h);
				v = Math.max(sizes[i][1], v);
 			}else {
 				h = Math.max(sizes[i][1], h);
 				v = Math.max(sizes[i][0], v);
 			}
		}
		answer = h * v;
		return answer;
	}
}
