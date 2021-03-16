package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2435_기상청인턴신현수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		for(int i = 0 ; i < K ;i++) {
			sum += arr[i];
		}
		int max = sum;
		for(int i = K; i < N; i++) {
			sum += arr[i];
			sum -= arr[i-K];
			if(max < sum) max = sum;
		}
		System.out.println(max);
	}
}
