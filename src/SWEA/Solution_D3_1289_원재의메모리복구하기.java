package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_1289_원재의메모리복구하기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String res = br.readLine();
			int cnt = 0;
			char[] arr = new char[res.length()];
			for(int i = 0; i<res.length();i++) {
				arr[i] = '0';
			}
			
			for (int i = 0; i < res.length(); i++) {
				if (res.charAt(i) != arr[i]) {
					for (int j = i; j < res.length(); j++) {
						arr[j] = res.charAt(i);
					}
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}

	}

}
