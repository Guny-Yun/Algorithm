package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2581_소수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N= Integer.parseInt(br.readLine());
		int[] num = new int[N+1];
		for(int i = 2; i <= N ;i++) {
			num[i] = i;
		}
		for(int i = 2; i <= N;i++) {
			if(num[i] == 0)continue;
			
			int tmp = i;
			for(int j = i +1 ; j <= N;j++) {
				if(j % tmp == 0)num[j] = 0;
			}
		}
		int min = 999999;
		int sum = 0;
		for(int i = N; i >=M;i--) {
			if(num[i] != 0) {
				min = num[i];
				sum+=num[i];
			}
		}
		if(min == 999999) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		System.out.println(min);
	}
}
