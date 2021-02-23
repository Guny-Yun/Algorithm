package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2961_도영이가만든맛있는음식 {
	static int answer = Integer.MAX_VALUE;
	static int N;
	static int[][] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N =Integer.parseInt(br.readLine());
		StringTokenizer st;
		arr = new int[N][2];
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		recur(0,1,0,0);
		
		System.out.println(answer);
	}
	public static void recur(int cnt, int sour, int bit, int c) {
		if(cnt == N) {
			if(answer > Math.abs(sour - bit) && c != 0) {
				answer = Math.abs(sour-bit);
			}
			return;
		}
		recur(cnt+1, sour * arr[cnt][0], bit+arr[cnt][1], c+1);
		recur(cnt +1, sour, bit, c);
	}
}
