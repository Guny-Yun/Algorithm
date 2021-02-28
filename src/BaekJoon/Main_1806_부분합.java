package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1806_부분합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());

		int[] arr = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int answer = Integer.MAX_VALUE;
		int s = 0;
		int e = 0;
		int sum =0;
		while(e <= N && s <= N) {
			if(sum >= S && answer > e-s)answer = e-s;
			
			if(sum < S) sum+= arr[e++];
			else sum -= arr[s++];
		}
		System.out.println(answer == Integer.MAX_VALUE? 0 : answer);
	}
}
