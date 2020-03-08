package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_5789_현주의상자바꾸기 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T;tc++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int Q = Integer.parseInt(input[1]);
			int[] box = new int[N+1];
			for(int i = 1; i<=Q;i++) {
				String[] input2 = br.readLine().split(" ");
				int L = Integer.parseInt(input2[0]);
				int R = Integer.parseInt(input2[1]);
				for(int j = L;j<=R;j++) {
					box[j] = i;
				}
			}
			System.out.print("#" + tc);
			for(int i = 1;i<=N;i++) {
				System.out.print(" " + box[i]);
			}
			System.out.println();
		}
	}
}
