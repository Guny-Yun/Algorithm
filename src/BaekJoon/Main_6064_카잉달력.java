package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_6064_카잉달력 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int tc = 1 ; tc<= T; tc++) {
			st=  new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			int cnt = X % (M +1);
			int tmpy = X;
			
			for(int i = 0 ; i < N ;i++) {
				int ty = tmpy % N == 0 ? N : tmpy % N;
				
				if(ty == Y)break;
				
				tmpy = ty + M;
				cnt += M;
			}
			
			if(cnt > lcm(M, N)) {
				bw.write(-1 + "\n");
			}else {
				bw.write(cnt + "\n");
			}
		}
		bw.flush();
	}
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r= a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
