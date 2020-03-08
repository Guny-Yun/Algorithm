package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2798_블랙잭 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] num = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		for(int i =0 ;i<N-2;i++) {
			for(int j = i+1; j<N-1;j++) {
				for(int k = j+1; k<N;k++) {
					if(num[i] + num[j] + num[k] <= M&& M-(num[i] + num[j] + num[k])<M-sum)
						sum = num[i] + num[j] + num[k];
				}
			}
		}
		System.out.println(sum);
	}
}
