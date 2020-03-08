package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1065_한수 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0,f,s,t;
		if(N<100)cnt = N;
		else {
			cnt+=99;
			for(int i = 100; i<=N;i++) {
				f= i/100;
				s= i/10%10;
				t= i%10;
				if(f-s == s-t)cnt++;
			}
		}
		System.out.println(cnt);
	}

}
