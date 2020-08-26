package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2512_예산 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int s = 0;
		int e = arr[arr.length-1];
		
		int answer = 0;
		while(s <= e) {
			int sum = 0;
			int m = (s + e) / 2;
			
			for(int i = 0 ; i < N;i++ ) {
				if(arr[i] > m) sum += m;
				else sum += arr[i];
			}
			
			if(max < sum) e = m - 1;
			else {
				answer = Math.max(answer, m);
				s = m + 1;
			}
		}
		System.out.println(answer);
	}
}
