package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1629_곱셈 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		System.out.println(func(A % C,B,C));
	}
	public static long func(long A, long B, long C) {
		if(B == 1)return A;
		
		long tmp = func(A, B/2, C) % C;
		
		if(B % 2 == 0) {
			return (tmp * tmp)%C;
		}
		else return (((tmp * tmp) % C) * A) % C;
	}
}
