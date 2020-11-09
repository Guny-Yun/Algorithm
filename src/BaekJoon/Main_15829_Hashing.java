package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15829_Hashing {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] in = br.readLine().toCharArray();
		
		long answer = 0;
		long r = 1;
		int mod = 1234567891;
		int mul = 31;
		for(int i = 0; i < N;i++) {
			answer = (answer + (in[i] - 'a' + 1) * r) % mod;
			r = (r * mul) % mod;
		}
		System.out.println(answer);
	}
}
