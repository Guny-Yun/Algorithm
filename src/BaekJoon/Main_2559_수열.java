package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2559_수열 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr= new int[N+1];
		st = new StringTokenizer(br.readLine());	
		for(int i = 1;i<=N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int sum = 0;
		for(int i = 1;i<=K;i++) {
			sum += arr[i];
			max +=arr[i];
		}
		for(int i = K+1;i<=N;i++) {
			sum+= arr[i];
			sum-= arr[i-K];
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

}
