package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1181_수찾기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < M;i++) {
			int tmp = Integer.parseInt(st.nextToken());
//			if(Arrays.binarySearch(arr, tmp) >=0) {
//				sb.append(1 + "\n");
//			}else sb.append(0 + "\n");
			int result = bSearch(arr, tmp);
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}
	static int bSearch(int[] arr, int val) {
		int l = 0;
		int h = arr.length - 1;
		while(l <= h) {
			int mid = (l + h) /2;
			if(arr[mid] > val) {
				h = mid -1;
			}else if(arr[mid] < val) {
				l = mid + 1;
			}else return 1;
		}
		return 0;
	}

}
