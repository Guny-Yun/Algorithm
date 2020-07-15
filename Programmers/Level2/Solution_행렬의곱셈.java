package Level2;

public class Solution_행렬의곱셈 {
	static int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
	static int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};
	public static void main(String[] args) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		int row_len = arr1.length;
		int col_len = arr2[0].length;
		for(int i = 0 ; i < row_len;i++) {
			for(int j = 0 ; j < col_len;j++) {
				for(int k = 0 ; k < arr1[0].length;k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
	}

}
