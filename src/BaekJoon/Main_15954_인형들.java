package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15954_인형들 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		double v = 0;
		double tmp = 0;
		double m = 0;
		double standard = 0;
		double min = 1000000;
		
		st= new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0 ; i <= N-K; i++) {
			int cnt = K;
			
			while(i + cnt  <= N) {
				tmp = m = v = standard = 0;
				for(int j = 0 ; j <cnt;j++) {
					tmp += arr[i + j];
				}
				m = tmp / cnt;
				tmp = 0;
				for(int j = 0; j < cnt; j++) {
					tmp += (arr[i + j] - m) * (arr[i+j] - m);
				}
				v = tmp /cnt;
				standard = Math.sqrt(v);
				min = Math.min(min, standard);
				cnt++;
			}
		}
		System.out.println(String.format("%.11f", min));
	}
}
