package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2110_공유기설치 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			arr[i] = tmp;
		}
		Arrays.sort(arr);
		int start = 1;
		int end = arr[N - 1];
		int answer = 0;
		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (test(arr, mid, C)) {
				answer = Math.max(answer, mid);
				start = mid + 1;
			} else
				end = mid - 1;
		}
		System.out.println(answer);
	}

	static boolean test(int[] arr, int mid, int c) {
		int cnt = 1;
		int cur = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int next = arr[i];
			int diff = next - cur;
			if (diff >= mid) {
				cnt++;
				cur = next;
			}
		}
		if (cnt >= c)
			return true;
		else
			return false;
	}

}
