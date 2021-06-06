package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11256_사탕 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int tc=  1; tc<= T ; tc++) {
			st=  new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			
			for(int i = 0 ; i < N;i++) {
				st = new StringTokenizer(br.readLine());
				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				arr[i] = r * c;
			}
			Arrays.parallelSort(arr);
			int sum = 0;
			int cnt = 0;
			for(int i = N-1; i >= 0; i--) {
				sum += arr[i];
				cnt++;
				if(sum >= j) {
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}
