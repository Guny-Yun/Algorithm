package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_16401_과자나눠주기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int answer = 0;
		
		int s = 1;
		int e = arr[N-1];
		
		while(s <= e) {
			int mid = (s+e)/2;
			int cnt = 0;
			
			for(int i = 0 ; i < N;i++) {
				cnt += arr[i]/mid;
			}
			if(cnt >= M) {
				if(answer < mid) {
					answer = mid;
					s = mid+1;
				}
			}else {
				e = mid-1;
			}
		}
		System.out.println(answer);
	}

}
