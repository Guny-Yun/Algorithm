package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546_평균 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] arr = new double[N];
		
		double max = 0;
		for(int i = 0; i<N;i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		double sum =0;
		for(int i = 0; i<N;i++) {
			arr[i] = arr[i]/max *100;
			sum+=arr[i];
		}
		double avg = sum/N;
		System.out.println(avg);
	}
}
