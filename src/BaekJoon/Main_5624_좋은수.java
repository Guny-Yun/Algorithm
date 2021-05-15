package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_5624_좋은수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		boolean[] visit = new boolean[400001];
		int answer = 0;
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < i;j++) {
				if(visit[arr[i] - arr[j] + 200000]) {
					answer++;
					break;
				}
			}
			for(int j = 0 ; j <= i; j++) {
				visit[arr[i] + arr[j] + 200000] = true;
			}
		}
		System.out.println(answer);
	}
}
