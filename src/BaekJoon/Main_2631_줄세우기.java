package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2631_줄세우기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int end =1;
		arr[0] = Integer.parseInt(br.readLine());
		for(int i = 1; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			int left = 0,right = end;
			
			while(left < right) {
				int mid = (left + right)/2;
				if(arr[mid] < tmp) left = mid+1;
				else right = mid;
			}
			arr[right] = tmp;
			if(right == end)end++;
		}
		System.out.println(N - end);
	}
}
