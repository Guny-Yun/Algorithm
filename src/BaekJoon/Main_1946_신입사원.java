package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1946_신입사원 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc= 1; tc<=T;tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N+1];
			for(int i = 0 ; i < N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[a] = b;
			}
			int cnt = 1;
			int st = arr[1];
			for(int i = 2; i <= N;i++ ) {
				if(st > arr[i]) {
					cnt++;
					st = arr[i];
				}
			}
			System.out.println(cnt);
		}
	}
}
