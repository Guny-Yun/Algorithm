package SWEA;

import java.util.Scanner;

public class Solution_D4_1210_Ladder1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map;

		for (int t = 1; t <= 10; t++) {
			int x = 99, y = 0;
			int tc = sc.nextInt();

			map = new int[100][100];

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = sc.nextInt();
					if (map[i][j] == 2)	y = j;
					//입력받으면서 map 가장 아래 j가 2일때 체크
				}
			}
			while (x > 0) {
				if (x == 0) {
					System.out.println(y);
					break;
				}
				// 왼쪽으로 쭉 가고나서 x좌표 위로 한칸
				if (y > 0 && map[x][y - 1] == 1) {
					while (y > 0 && map[x][y - 1] == 1)
						y--;
					x--;
					
				//오른쪽으로 쭉 가고나서 x좌표 위로 한칸
				} else if (y < 99 && map[x][y + 1] == 1) {
					while (y < 99 && map[x][y + 1] == 1)
						y++;
					x--;
				} else x--; //위로 쭉 이동
			}
			System.out.println("#" + t + " " + y);
		}
	}
}