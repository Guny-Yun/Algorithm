package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2847_게임을만든동준이 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;
		for(int i = N-1; i> 0 ; i--) {
			if(arr[i] <= arr[i-1]) {
				while(true) {
					if(arr[i] > arr[i-1])break;
					else {
						cnt++;
						arr[i-1]--;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
