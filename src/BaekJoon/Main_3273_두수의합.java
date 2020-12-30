package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_3273_두수의합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.parallelSort(arr);
		int X = Integer.parseInt(br.readLine());
		int answer = 0;
		int s = 0;
		int e = N-1;
		int sum = 0;
		while(s < e) {
			sum = arr[s] + arr[e];
			if(sum == X)answer++;
			if(sum <= X)s++;
			else e--;
		}
		System.out.println(answer);
	}
}
