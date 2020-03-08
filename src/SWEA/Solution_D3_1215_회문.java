package SWEA;

import java.util.Scanner;

public class Solution_D3_1215_회문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int n = sc.nextInt();
			char[][] arr = new char[8][8];
			for (int i = 0; i < 8; i++) {
				arr[i] = sc.next().toCharArray();
			}
			
			int cnt = 0;
			for (int a = 0; a <= 8-n; a++) {
				int flag = 1;
				for (int b = 0; b < 8; b++) {
					flag = 1;
					for(int k = 0; k < n / 2; k++) {
						if (arr[b][a + k] != arr[b][a + n - 1 - k]) {
							flag = 0;
							break;
						}
					}
					if (flag == 1) cnt++;
					
					///////////////////////////////////////////////////////
					flag = 1;
					
					for(int k = 0; k < n / 2; k++) {
						if (arr[a + k][b] != arr[a + n - 1 - k][b]) {
							flag = 0;
							break;
						}
					}
					if (flag == 1)cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}
