package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1449_수리공항승 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		boolean[] pipe = new boolean[1001];
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		for(int i = 0 ; i < N;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			pipe[tmp] = true;
		}
		for(int i = 0; i < 1001; i++) {
			if(pipe[i]) {
				for(int j = 0; j < L;j++) {
					pipe[j] = false;
				}
				i += L - 1;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
