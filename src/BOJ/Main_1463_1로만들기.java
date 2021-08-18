package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1463_1로만들기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = rec(N,0);
		System.out.println(answer);
	}
	public static int rec(int N, int cnt) {
		if(N < 2)return cnt;
		
		return Math.min(rec(N/2, cnt+1 + (N%2)), rec(N/3,cnt+1+(N%3)));
	}

}
