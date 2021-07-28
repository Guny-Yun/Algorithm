package NHN;

public class Solution_2 {
	static int day = 2;
	static int width = 6;
	static int[][] blocks = { { 6, 2, 11, 0, 3, 5 }, { 6, 3, 0, 9, 0, 5 } };

	public static void main(String[] args) {
		int answer = 0;
		int sum = 0;
		for (int i = 0; i < day; i++) {
			int max = 0;
			int max_idx = 0;
			int block_sum = 0;
			for (int j = 0; j < width; j++) {
				if (blocks[i][j] > max) {
					max = blocks[i][j];
					max_idx = j;
				}
				block_sum += blocks[i][j];
			}
			int tmpmaxy = blocks[i][0];

			for (int j = 0; j < max_idx; j++) {
				if (blocks[i][j] >= tmpmaxy)
					tmpmaxy = blocks[i][j];
				sum += tmpmaxy;
			}
			tmpmaxy = blocks[i][width - 1];

			for (int j = width - 1; j >= max_idx; j--) {
				if (blocks[i][j] >= tmpmaxy)
					tmpmaxy = blocks[i][j];
				sum += tmpmaxy;
			}
			sum = sum - block_sum;
		}
	}

}
