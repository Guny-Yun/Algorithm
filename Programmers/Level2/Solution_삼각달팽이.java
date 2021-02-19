package Level2;

public class Solution_삼각달팽이 {
	static int n = 5;
	public static void main(String[] args) {
		int[] answer = new int[(n*(n+1))/2];
		int[][] mat = new int[n][n];
		
		int x = -1;
		int y = 0;
		int num = 1;
		for(int i = 0 ; i < n;i++) {
			for(int j = i; j < n; j++) {
				if(i %3 == 0) x++;
				else if(i % 3 == 1)y++;
				else if(i % 3 == 2) {
					x--;
					y--;
				}
				mat[x][y] = num++;
			}
		}
		int k = 0 ;
		for(int i = 0 ; i < n;i++) {
			for(int j = 0 ; j < n;j++) {
				if(mat[i][j] == 0)break;
				
				answer[k++] = mat[i][j];
			}
		}
		
		for(int a : answer)System.out.print(a + " ");
	}

}
