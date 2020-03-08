package SWEA;

import java.util.*;

public class Solution_D1_2027_대각선출력하기 {

	public static void main(String[] args) {
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j)
					System.out.print("#");
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}
}
