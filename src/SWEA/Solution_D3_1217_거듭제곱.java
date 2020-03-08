package SWEA;

import java.util.*;
public class Solution_D3_1217_거듭제곱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc<=10;tc++) {
			int T = sc.nextInt();
			System.out.println("#" + tc + " " + (int)Math.pow(sc.nextInt(), sc.nextInt()));
		}
	}
}
