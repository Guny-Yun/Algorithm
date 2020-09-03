package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11098_첼시를도와줘 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int tc = 0; tc < T;tc++) {
			int N = Integer.parseInt(br.readLine());
			String[] arr = new String[N];
			int[] price = new int[N];
			StringTokenizer st;
			int idx = 0;
			int max = 0;
			for(int i = 0 ; i < N;i++) {
				st = new StringTokenizer(br.readLine());
				price[i] = Integer.parseInt(st.nextToken());
				arr[i] = st.nextToken();
				if(price[i] > max) {
					max = price[i];
					idx = i;
				}
			}
			sb.append(arr[idx] + "\n");
		}
		System.out.println(sb);
		
	}

}
