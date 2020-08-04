package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10158_개미 {
	static int dx = 1;
	static int dy = 1;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken()); // 가로
		int h = Integer.parseInt(st.nextToken()); // 세로
		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken()); // 가로 위치
		int q = Integer.parseInt(st.nextToken()); // 세로 위치
		int t = Integer.parseInt(br.readLine());
		
		p += t;
		q += t;
		p %= (2 * w);
		q %= (2 * h);
		
		if(p> w) p = 2 * w - p;
		if(q> h) q = 2 * h - q;
		
		System.out.println(p + " " + q);
	}
}
