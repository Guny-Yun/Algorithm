package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5525_IOIOI {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		char[] S = br.readLine().toCharArray();
		int answer =0;
		int cnt = 0;
		for(int i = 1; i < M-1; i++) {
			if(S[i-1] == 'I' && S[i] == 'O' && S[i+1] == 'I') {
				cnt++;
				if(cnt == N) {
					cnt--;
					answer++;
				}
				i++;
			}else cnt = 0;
		}
		System.out.println(answer);
	}
}
