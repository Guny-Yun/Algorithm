package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2485_가로수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] tree = new int[N];
		int[] gap = new int[N-1];
		for(int i = 0 ; i < N;i++) {
			tree[i] = Integer.parseInt(br.readLine());
			
			if(i > 0)gap[i-1] = tree[i] - tree[i-1];
		}
		for(int i = 0 ; i <= gap.length-2; i++) {
			gap[i+1] = gcd(gap[i], gap[i+1]);
		}
		
		int g = gap[gap.length-1];
		int answer = (tree[N-1] - tree[0]) / g - (N-1);
		System.out.println(answer);
	}
	public static int gcd(int a, int b) {
		while(b > 0) {
			int tmp = a;
			a= b;
			b = tmp % b;
		}
		return a;
	}
}
