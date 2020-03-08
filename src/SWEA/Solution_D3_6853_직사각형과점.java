package SWEA;

import java.util.Scanner;

public class Solution_D3_6853_직사각형과점 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int in=0,on=0,out=0;
			int N = sc.nextInt();
			for(int i = 0;i<N;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				if(x <x1 || x > x2 || y<y1 || y>y2) out++;
				else if(x > x1 && x<x2 && y>y1 && y<y2)in++;
				else on++;
			}
			System.out.println("#" + tc + " " + in + " " + on + " " + out);
		}
		sc.close();
	}

}
