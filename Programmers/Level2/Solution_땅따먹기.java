package Level2;

public class Solution_땅따먹기 {
	static int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
	public static void main(String[] args) {
		int N = land.length;
		int answer = 0;
		for(int i = 1 ; i < N ;i++) {
			land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2],land[i-1][3]));
			land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2],land[i-1][3]));
			land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1],land[i-1][3]));
			land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1],land[i-1][2]));
		}
		for(int i = 0 ; i < 4;i++) {
			int tmp = land[N-1][i];
			answer = Math.max(answer, tmp);
		}
		System.out.println(answer);
	}

}
