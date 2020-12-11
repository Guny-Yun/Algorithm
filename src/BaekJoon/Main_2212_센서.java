package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2212_센서 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int[] road = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			road[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(road);
		
		int[] diff = new int[N-1];
		for(int i = 0 ; i < N-1;i++) {
			diff[i] = road[i+1] - road[i];
		}
		Arrays.sort(diff);
		int answer = 0;
		for(int i = 0 ; i < N-K;i++) {
			answer += diff[i];
		}
		System.out.println(answer);
	}
}
