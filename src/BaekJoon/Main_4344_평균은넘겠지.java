package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4344_평균은넘겠지{

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T ; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			double[] arr = new double[N];
			int sum = 0;
			for(int i = 0; i<N;i++) {
				arr[i] = Double.parseDouble(st.nextToken());
				sum+= arr[i];
			}
			double avg = sum/N;
			double cnt = 0;
			for(int i =0 ;i<N;i++) {
				if(avg<	arr[i])cnt++;
			}
			double res = cnt/N*100;
			System.out.printf("%.3f%%\n",res);
		}
	}
}
