package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2491_수열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 1;
		int max = 1;
		for(int i = 0 ; i < N-1; i++) {
			if(arr[i] <= arr[i+1]) cnt++;
			else cnt =1;
			max = Math.max(max, cnt);
		}
		int cnt2 = 1;
		for(int i = 0 ; i < N-1;i++) {
			if(arr[i] >= arr[i+1])cnt2++;
			else cnt2 = 1;
			max = Math.max(max, cnt2);
		}
		System.out.println(max);
	}
}
