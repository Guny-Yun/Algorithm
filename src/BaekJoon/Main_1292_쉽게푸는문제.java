package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1292_쉽게푸는문제 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[] arr = new int[1001];
		int idx = 1;
		for(int i =1; i<= 1000;i++) {
			for(int j = 1; j<= i; j++) {
				if(idx == 1001)break;
				arr[idx] = i;
				idx++;
			}
		}
		int answer =0 ;
		for(int i = A; i<= B;i++) {
			answer += arr[i];
		}
		System.out.println(answer);
	}
}
