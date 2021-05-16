package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_11508_2plus1세일 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		for(int i = 0 ; i < N;i++)arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr, Comparator.reverseOrder());
		int answer = 0;
		for(int i = 0 ; i < N; i++) {
			if(i % 3 == 2)continue;
			answer += arr[i];
		}
		System.out.println(answer);
	}

}
