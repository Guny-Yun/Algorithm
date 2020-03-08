package SWEA;

import java.util.*;

public class Solution_D3_1213_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc<=10;tc++) {
			int t = sc.nextInt();
			String target = sc.next();
			String str = sc.next();
			int cnt = str.split(target,-1).length -1;
			
			System.out.println("#"+tc + " "+ cnt );
		}
	}
}
