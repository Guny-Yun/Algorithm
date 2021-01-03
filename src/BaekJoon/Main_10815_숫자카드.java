package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_10815_숫자카드 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N;i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		int[] target = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M;i++) target[i] = Integer.parseInt(st.nextToken());
		
		Arrays.parallelSort(arr);
		
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M;i++) {
			int left = 0;
			int right = N-1;
			int mid = 0;
			int val = target[i];
			
			while(left <= right) {
				mid = (left + right)/2;
				
				if(arr[mid] > val) {
					right = mid -1;
					answer =0;
				}else if(arr[mid] < val) {
					left = mid +1;
					answer =0;
				}else {
					answer =1;
					break;
				}
			}
			sb.append(answer + " ");
		}
		System.out.println(sb);
	}
}
