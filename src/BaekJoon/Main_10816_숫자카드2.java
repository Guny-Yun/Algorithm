package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10816_숫자카드2 {
	static int[] arr;
	static int[] count;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		count = new int[N];
		int cnt = 0;
		int idx = 0;
		while(true) {
			if(idx >= N-1)break;
			cnt = 1;
			for(int i = idx +1; i <N;i++) {
				if(arr[idx] == arr[i]) {
					cnt++;
				}
				else if(arr[idx] < arr[i])break;
			}
			for(int i = idx; i< idx+cnt;i++) {
				count[i] = cnt;
			}
			idx += cnt;
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] res = new int[M];
		for(int i = 0 ; i < M;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			res[i] = bSearch(tmp);
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < M;i++) {
			if(i==M-1) sb.append(res[i] + "\n");
			else sb.append(res[i] + " ");
		}
		System.out.println(sb);
				
		
	}
	public static int bSearch(int target) {
		int s = 0;
		int e = arr.length-1;
		int cnt = 0;
		while(s <= e) {
			int mid = (s+e) /2;
			if( target > arr[mid])s = mid + 1;
			else if(target < arr[mid]) e = mid -1;
			else
				return cnt+ count[mid];
		}
		return cnt;
	}

}
