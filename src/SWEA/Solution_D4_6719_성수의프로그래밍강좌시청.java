package SWEA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution_D4_6719_성수의프로그래밍강좌시청 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T;tc++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int N = sc.nextInt();
			int K = sc.nextInt();
			for(int i = 0; i< N;i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			double A = 0;
			for(int i = N-K; i<N;i++) {
				A = (A+list.get(i))/2;
			}
			System.out.println("#" + tc + " " + A);
		}
		sc.close();
	}
}
