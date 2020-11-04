package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main_2108_통계학 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 4001;
		int mode = 4001;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++;
		
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		int count = 0;
		int mode_max = 0;
		
		boolean flag = false;	 
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			
			if(arr[i] > 0) {
				if(count < (N + 1) / 2) {
					count += arr[i];
					median = i - 4000;
				}
				
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;
				}
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append((int)Math.round((double)sum / N) + "\n");
		sb.append(median + "\n").append(mode + "\n").append(max - min + "\n");
		System.out.println(sb);
	}
 
}