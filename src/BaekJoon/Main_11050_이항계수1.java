package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11050_이항계수1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int answer = fac(N)/(fac(K) * fac(N-K));
		System.out.println(answer);
	}
	public static int fac(int n) {
		int res = 1;
		while(n >1) {
			res *= n--;
		}
		return res;
	}

}
