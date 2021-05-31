package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_21567_숫자의개수2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long A = Long.parseLong(br.readLine());
		long B = Long.parseLong(br.readLine());
		long C = Long.parseLong(br.readLine());
		long x = A * B * C;
		char[] ans = String.valueOf(x).toCharArray();
		int[] num = new int[10];
		
		for(int i = 0 ; i < ans.length;i++) {
			num[ans[i] - '0']++;
		}
		for(int i = 0 ; i < 10; i++) {
			System.out.println(num[i]);
		}
	}
}
