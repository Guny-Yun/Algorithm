package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2470_두용액 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.parallelSort(arr);
		
		int gap = Integer.MAX_VALUE;
		int l = 0;
		int r = arr.length-1;
		
		int first = 0;
		int second = 0;
		while(l < r) {
			int sum = arr[l] + arr[r];
			int tmp = Math.abs(sum);
			if(tmp < gap) {
				gap = tmp;
				first = arr[l];
				second = arr[r];
			}
			
			if(sum > 0) r--;
			else l++;
		}
		System.out.println(first + " " + second);
	}
}
