package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2805_나무자르기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken());
		int M =Integer.parseInt(st.nextToken());
		int[] trees = new int[N];
		st = new StringTokenizer(br.readLine());
		long max = 0;
		for(int i = 0 ; i < N;i++) {
			trees[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, trees[i]);
		}
		long start = 0;
		long end = max;
		while(start <= end) {
			long mid = (start + end)/2;
			long sum = 0;
			for(int tree : trees) {
				if(tree > mid) {
					sum += tree - mid;
				}
			}
			if(sum >= M) {
				start = mid +1;
			}else {
				end = mid -1;
			}
		}
		System.out.println(end);
	}
}
