package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11441_합구하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[N+1];
		for(int i =1 ;i <= N ;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = arr[i-1] + tmp;
		}
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int k = 0 ; k < T; k++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int answer = arr[b] - arr[a-1];
			sb.append(answer + "\n");
		}
		System.out.println(sb);
	}
}
