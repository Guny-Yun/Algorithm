package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_1477_휴게소세우기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int left = 0;
		int right = 0;
		int[] arr = new int[N+2];
		arr[N+1] = L;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.parallelSort(arr);
		
		for(int i =1; i<= N+1;i++) {
			right = Math.max(right, arr[i] - arr[i-1] + 1);
		}
		while(left <= right) {
			int mid = (left + right) / 2;
			int sum = 0;
			for(int i = 1; i <= N+1;i++) {
				if(arr[i] > arr[i-1]) sum += (arr[i] - arr[i-1] -1) / mid;
			}
			
			if(sum > M) left = mid +1;
			else right = mid- 1;
		}
		System.out.println(left);
	}

}
