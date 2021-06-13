package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2548_대표자연수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[10001];
		for(int i = 0 ; i < N;i++) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		int cnt = 0;
		int idx = 1;
		while(Math.round(N / 2.0f) != cnt) {
			if(arr[idx] > 0) {
				arr[idx]--;
				cnt++;
			}else idx++;
		}
		System.out.println(idx);
	}
}
