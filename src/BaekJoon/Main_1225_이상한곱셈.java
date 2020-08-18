package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1225_이상한곱셈 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		String[] a = st.nextToken().split("");
		String[] b = st.nextToken().split("");
		
		long A = 0, B = 0;
		for(int i = 0 ; i < a.length;i++) {
			A += Integer.parseInt(a[i]);
		}
		for(int i = 0 ; i < b.length;i++) {
			B += Integer.parseInt(b[i]);
		}
		long answer = A * B;
		System.out.println(answer);
	}

}
