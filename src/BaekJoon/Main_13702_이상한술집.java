package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_13702_이상한술집 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.parallelSort(arr);
		int s = 0;
		int e = arr[N-1];
		int mid = 0;
		while(s < e) {
			mid = (s+e) / 2;
			int tmp = 0;
			for(int i = 0 ; i < N;i++) {
				tmp += arr[i] / mid;
			}
			if(tmp < K) e = mid;
			else s = mid + 1;
		}
		System.out.println(e-1);
	}
}
