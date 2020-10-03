package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1940_주몽 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int s = 0;
		int e = N-1;
		int cnt = 0;
		while(s < e) {
			if(arr[s] + arr[e] < M) {
				s++;
			}else if(arr[s] + arr[e] > M) {
				e--;
			}else {
				s++;
				e--;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
