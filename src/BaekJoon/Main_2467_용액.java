package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2467_용액 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = Integer.MAX_VALUE;
		int l1 = 0, l2 = 0;
		for(int i = 0; i < N;i++) {
			int a = i + 1, b = N - 1;
			while(a <= b) {
				int m = (a + b)/ 2;
				int v = Math.abs(arr[i] + arr[m]);
				if(min > v) {
					min = v;
					l1 = arr[i];
					l2 = arr[m];
				}
				
				if(arr[m] == -arr[i]) break;
				else if(arr[m] < -arr[i]) a = m + 1;
				else b = m-1;
			}
		}
		System.out.println(l1 + " " + l2);
	}
}
