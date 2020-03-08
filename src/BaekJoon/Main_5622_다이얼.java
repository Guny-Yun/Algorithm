package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5622_다이얼 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		int sum = 0;
		for(int i = 0 ; i < in.length;i++) {
			sum+= dial(in[i]) + 1;
		}
		System.out.println(sum);
	}

	public static int dial(char number) {
		switch (number) {
		case 'A':
		case 'B':
		case 'C':
			return 2;
		case 'D':
		case 'E':
		case 'F':
			return 3;
		case 'G':
		case 'H':
		case 'I':
			return 4;
		case 'J':
		case 'K':
		case 'L':
			return 5;
		case 'M':
		case 'N':
		case 'O':
			return 6;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			return 7;
		case 'T':
		case 'U':
		case 'V':
			return 8;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			return 9;
		default:
			return -1;

		}
	}

}
