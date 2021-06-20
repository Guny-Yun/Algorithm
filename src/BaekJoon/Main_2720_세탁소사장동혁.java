package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2720_세탁소사장동혁 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<= N; tc++) {
			int s = Integer.parseInt(br.readLine());
			int[] arr = new int[4];	
			for(int i = 0 ; i < 4; i++) {
				if(s >= 25) {
					arr[0] = s / 25;
					s = s % 25;
				}else if( s >= 10 && s < 25) {
					arr[1] = s / 10;
					s = s % 10;
				}else if(s >= 5 && s < 10) {
					arr[2] = s/ 5;
					s = s % 5;
				}else if(s >= 1 && s < 5) {
					arr[3] = s/1;
					s = s % 1;
				}
			}
			for(int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
}
