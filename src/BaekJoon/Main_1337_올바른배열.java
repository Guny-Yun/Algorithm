package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1337_올바른배열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.parallelSort(arr);
		int answer = Integer.MAX_VALUE;
		int l = 0;
		int r = 0;
		while(r >= l) {
			if(r >= arr.length)break;
			if(arr[r] - arr[l] > 4) {
				l++;
			}else {
				int cnt = 5 - (r-l+1);
				answer = Math.min(cnt, answer);
				r++;
			}
		}
		System.out.println(answer);
	}
}
