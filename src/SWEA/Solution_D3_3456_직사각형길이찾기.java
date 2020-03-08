package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3456_직사각형길이찾기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int[] num = new int[3];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			if (num[0] == num[1]) {
				System.out.println("#" + tc + " " + num[2]);
			}
			else if (num[2] == num[1]) {
				System.out.println("#" + tc + " " + num[0]);
			}
			else {
				System.out.println("#" + tc + " " + num[1]);
			}
		}
	}
}
