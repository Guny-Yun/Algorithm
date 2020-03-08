package SWEA;

import java.util.Scanner;

public class Solution_D3_1493_수의새로운연산 {

	public static void main(String[] args) {
		int[][] map= new int[4][4];
		Scanner sc = new Scanner(System.in);
		int cnt = 1,idx=0,jdx=0;
		int nj = 0;
		while (cnt <= 25) {
			map[idx][jdx] = cnt++;
			if (jdx == 0) {
				idx = 0;
				jdx = jdx+1;
			} else {
				idx++;
				jdx--;
			}
		}
		//map 입력 끝
		int T = sc.nextInt();
		for(int tc = 1; tc<=T;tc++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int pi=0,pj=0,qi=0,qj=0;
			for(int i =0;i<map.length;i++) {
				for(int j = 0; j<map.length;j++) {
					if(map[i][j] == p) {
						pi = i;pj=j;
					}if(map[i][j] == q) {
						qi = i;qj=j;
					}
				}
				
			}
			int res = map[pi+qi][pj+qj];
			System.out.println("#" + tc + " " + res);
		}
		sc.close();
	}
}
