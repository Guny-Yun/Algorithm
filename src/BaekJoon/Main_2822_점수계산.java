package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2822_점수계산 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = new int[8];

		for (int i = 0; i < 8; i++) {
			in[i] = Integer.parseInt(br.readLine());
		} // 입력 끝
		int[] point = new int[5];
		int[] index = new int[5];
		for (int i = 0; i < 5; i++) {
			int topPoint = 0;
			int topPoint_idx = 0;
			for (int j = 0; j < 8; j++) {
				if (topPoint < in[j]) {
					topPoint = in[j];
					topPoint_idx = j;
				}
			}
			in[topPoint_idx] = 0;
			point[i] = topPoint;
			index[i] = topPoint_idx + 1;
		}
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += point[i];
		}
		Arrays.sort(index);
		System.out.println(sum);
		for (int i = 0; i < 5; i++) {
			System.out.print(index[i] + " ");
		}

	}

}
