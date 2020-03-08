package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9461_파도반수열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long[] arr= new long[101];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		arr[5] = 2;
		for(int i = 6;i<=100;i++) {
			arr[i] = arr[i-1] + arr[i-5];
		}
		for(int tc= 1; tc<=T;tc++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println(arr[N]);
		}
	}
}
