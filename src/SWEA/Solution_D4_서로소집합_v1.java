package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_서로소집합_v1 {
	public static int[] set;
	public static int getParent(int a) {
		if (set[a] == a)return a;
		return getParent(set[a]);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			set = new int[N + 1];
			for (int i = 1; i <= N; i++)set[i] = i;
			
			System.out.print("#" + tc + " ");
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int cal = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if (cal == 0) {
					a = getParent(a);
					b = getParent(b);
					if (a < b)set[b] = a;
					else set[a] = b;
				}else{
					if (getParent(a) == getParent(b))System.out.print(1);
					else System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}