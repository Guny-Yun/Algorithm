package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11004_K번째수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(quick(arr, 0, N - 1, K - 1));
	}

	public static int quick(int[] arr, int start, int end, int k) {
		int pivot = part(arr, start, end);
		if (pivot == k)
			return arr[pivot];
		else if (pivot > k)
			return quick(arr, start, pivot - 1, k);
		else
			return quick(arr, pivot + 1, end, k);
	}

	public static int part(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start - 1;
		for (int j = start; j <= end; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr, i, end);

		return i;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
