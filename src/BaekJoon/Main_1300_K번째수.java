package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1300_K번째수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		int s = 1;
		int e = K;
		int mid = 0;
		int sum = 0;
		int answer = 0;
		while(s <= e) {
			mid = (s+e)/2;
			sum = 0;
			for(int i = 1; i <= N;i++) {
				sum += Math.min(mid / i, N);
			}
			if(sum >= K) {
				e = mid - 1;
				answer = mid;
			}else
				s = mid + 1;
		}
		System.out.println(answer);
	}

}
