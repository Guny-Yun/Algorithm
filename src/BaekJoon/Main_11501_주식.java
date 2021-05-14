package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11501_주식 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int tc = 1; tc<= T; tc++) {
			int N =Integer.parseInt(br.readLine());
			int stock[] = new int[N+1];
			long money = 0;
			int max = 0;
			st=  new StringTokenizer(br.readLine());
			for(int i = 0 ; i < N;i++) {
				stock[i] = Integer.parseInt(st.nextToken());
			}
			for(int i = N-1; i > -1; i--) {
				if(stock[i]> max)max = stock[i];
				else money += (max - stock[i]);
			}
			System.out.println(money);
		}
	}
}
