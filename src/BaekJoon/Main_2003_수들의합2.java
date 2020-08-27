package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2003_수들의합2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st =  new StringTokenizer(br.readLine());
		for(int i = 0 ; i< N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		h:for(int i = 0 ; i < N;i++) {
			int sum = 0;
			for(int j = i; j < N;j++) {
				sum += arr[j];
				if(sum == M) {
					cnt++;
					continue h;
				}else if(sum > M) continue h;
			}
		}
		System.out.println(cnt);
	}
}
