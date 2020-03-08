package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_D4_4366_정식이의은행업무 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			char[] two = br.readLine().toCharArray();
			char[] three = br.readLine().toCharArray();

			int twolen = two.length;
			int thrlen = three.length;

			int res = 0;
			here: for (int i = 0; i < twolen; i++) { // 2진수
				char[] two_tmp = Arrays.copyOf(two, twolen);
				two_tmp[i] = two_tmp[i] == '0' ? '1' : '0';
				res = toTen(two_tmp, 2);
				for (int j = 0; j < thrlen; j++) { // 3진수
					char[] thr_tmp = Arrays.copyOf(three, thrlen);

					switch (thr_tmp[j]) {
					case '0':
						thr_tmp[j] = '1';
						if (Math.abs(res - toTen(thr_tmp, 3)) == 0)
							break here;
						thr_tmp[j] = '2';
						if (Math.abs(res - toTen(thr_tmp, 3)) == 0)
							break here;
					case '1':
						thr_tmp[j] = '0';
						if (Math.abs(res - toTen(thr_tmp, 3)) == 0)
							break here;
						thr_tmp[j] = '2';
						if (Math.abs(res - toTen(thr_tmp, 3)) == 0)
							break here;
					case '2':
						thr_tmp[j] = '0';
						if (Math.abs(res - toTen(thr_tmp, 3)) == 0)
							break here;
						thr_tmp[j] = '1';
						if (Math.abs(res - toTen(thr_tmp, 3)) == 0)
							break here;
					}
				}
			}
			System.out.println("#" + tc + " " + res);
		}
	}

	public static int toTen(char[] arr, int n) {//10진수로
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int c = arr[arr.length - i - 1] - '0';
			res += c * Math.pow(n, i);
		}
		return res;
	}
}