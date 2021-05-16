package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15810_풍선공장 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long[] staff = new long[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			staff[i] = Long.parseLong(st.nextToken());
		}
		Arrays.parallelSort(staff);
		long l = 0;
		long r = staff[0] * M;
		while(l <= r) {
			long mid = (l + r)/ 2;
			long cnt = 0;
			for(int i = 0 ; i <N;i++) {
				cnt += mid/staff[i];
			}
			if(cnt < M) {
				l = mid+1;
			}else r = mid-1;
		}
		System.out.println(l);
	}

}
