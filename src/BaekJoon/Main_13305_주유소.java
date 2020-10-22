package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13305_주유소 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dis = new long[N-1];
		long[] price = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N-1;i++) {
			dis[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N;i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < N - 1;i++) {
			if(price[i] < price[i+1])
				price[i+1] = price[i];
		}
		long tot = 0;
		for(int i = 0 ; i < N-1;i++) {
			tot += dis[i] * price[i];
		}
		System.out.println(tot);
		
	}

}
