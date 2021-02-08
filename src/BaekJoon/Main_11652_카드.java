package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11652_카드 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] card = new long[N];
		for(int i = 0; i < N;i++)card[i] = Long.parseLong(br.readLine());
		Arrays.parallelSort(card);
		
		int cnt = 1;
		int max = 1;
		long answer = card[0];
		for(int i =1 ; i < N; i++) {
			if(card[i] == card[i-1])cnt++;
			else cnt = 1;
			
			if(max < cnt) {
				max = cnt;
				answer = card[i];
			}
		}
		System.out.println(answer);
	}
}
