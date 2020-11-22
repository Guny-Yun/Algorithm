package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1074_Z {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		N = (int)Math.pow(2, N);
		int i = 0;
		int j = 0;
		int answer = 0;
		
		while(N > 1) {
			N/=2;
			if(r < i + N && c < j+N) {
				
			}else if(r < i + N && c >= j+N) {
				answer += N * N * 1;
				j += N;
			}else if(r >= i + N && c < j+N) {
				answer += N*N*2;
				i += N;
			}else {
				answer += N*N*3;
				i+=N;
				j+=N;
			}
		}
		System.out.println(answer);
	}
}
