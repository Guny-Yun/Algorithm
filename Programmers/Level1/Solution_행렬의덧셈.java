package Level1;

public class Solution_행렬의덧셈 {
	static int[][] arr1 = { { 1, 2 }, { 2, 3 } };
	static int[][] arr2 = { { 3, 4 }, { 5, 6 } };

	public static void main(String[] args) {
		int[][] answer = new int[arr1.length][arr1[1].length];
		for (int i = 0; i < answer.length; i++) {// 행
			for (int j = 0; j < answer[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
	}

}
