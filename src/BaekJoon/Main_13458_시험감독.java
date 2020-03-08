package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13458_시험감독 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		long res= N;
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine()," ");
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		for(int i =0; i<N;i++) {
			int tmp = arr[i] - B;
			if(tmp>0) {
				res += tmp/C;
				if(tmp%C !=0)res += 1;
			}
		}
		System.out.println(res);
	}
}
