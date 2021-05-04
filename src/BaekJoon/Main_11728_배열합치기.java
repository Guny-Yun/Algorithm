package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11728_배열합치기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int[] brr = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++)
			brr[i] = Integer.parseInt(st.nextToken());

		int a = 0;
		int b = 0;
		StringBuilder sb = new StringBuilder();
		while (!(a == N || b == M)) {
			if (arr[a] <= brr[b]) {
				sb.append(arr[a] + " ");
				a++;
			} else {
				sb.append(brr[b] + " ");
				b++;
			}
		}
		if (a == N) {
			for (int i = b; i < M; i++)
				sb.append(brr[i] + " ");
		}
		if (b == M) {
			for (int i = a; i < N; i++)
				sb.append(arr[i] + " ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
