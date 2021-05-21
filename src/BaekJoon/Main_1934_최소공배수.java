package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1934_최소공배수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T= Integer.parseInt(br.readLine());
		for(int tc = 1; tc<= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a > b) {
				int tmp = a;
				a = b;
				b = tmp;
			}// a 큰수 
			
			int c = gcd(a,b);
			
			System.out.println(a * b / c);
		}
		
	}
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a= b;
			b = r;
		}
		return a;
	}
}
