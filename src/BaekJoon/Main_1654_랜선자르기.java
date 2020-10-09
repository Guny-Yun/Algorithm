package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1654_랜선자르기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] lans = new int[k];
		
		for(int i = 0 ; i < k;i++) {
			lans[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(lans);
		
		long left = 1;
		long right = lans[k-1];
		long middle = 0;
		
		while(left <= right) {
			long cnt = 0;
			middle = (left + right)/2;
			
			for(int i = 0 ; i < k;i++) {
				cnt += lans[i]/middle;
			}
			
			if(cnt < n) {
				right = middle -1;
			}else {
				left = middle+1;
			}
		}
		System.out.println(right);
		
	}

}
