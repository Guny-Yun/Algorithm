package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_13301_타일장식물 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[82];
		arr[1] = 1;
		for(int i = 2; i <= 80;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[N] * 4 + arr[N - 1] * 2);
	}

}
