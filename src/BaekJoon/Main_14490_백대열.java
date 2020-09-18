package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14490_백대열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int res = gcd(a,b);
		
		System.out.println(a/res + ":" + b/res);
		
	}
	public static int gcd(int a, int b) {
		if(b == 0 )return a;
		return gcd(b, a%b);
	}

}
