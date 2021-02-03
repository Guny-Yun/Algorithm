package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1027_고층건물 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] buildings = new int[N+1];
		for(int i = 1 ; i <= N ;i++) {
			buildings[i] = Integer.parseInt(st.nextToken());
		}
		int ans = 0;
		for(int i = 1 ; i < N;i++) {
			int cnt = 0;

			double e = 1000000000; // 10억
			for (int j = i - 1; j >= 1; j--)
			{
				double g = (buildings[i] - buildings[j]) * 1.0 / ((double)i - (double)j);
				if (g < e)
				{
					cnt++;
					e = g;
				}
			}

			e = -1000000000; // -10억
			// 오른쪽 빌딩 탐색
			for (int j = i + 1; j <= N; j++)
			{
				double g = (buildings[j] - buildings[i]) * 1.0 / ((double)j - (double)i);
				if (g > e)
				{
					cnt++;
					e = g;
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}

}
