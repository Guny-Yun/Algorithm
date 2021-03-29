package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2437_저울 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] wei = new int[N];
		for(int i = 0 ; i < N ;i++) {
			wei[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.parallelSort(wei);
		int answer = 1;
		for(int i = 0; i < N;i++) {
			if(answer <wei[i])break;
			
			answer += wei[i];
		}
		System.out.println(answer);
	}
}
