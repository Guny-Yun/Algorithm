package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10163_색종이 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[][] map = new int[101][101];
		for(int k =1 ; k<= N ;k++) {
			st = new StringTokenizer(br.readLine());
			int i1 = Integer.parseInt(st.nextToken());
			int j1 = Integer.parseInt(st.nextToken());
			int i2 = Integer.parseInt(st.nextToken());
			int j2 = Integer.parseInt(st.nextToken());
			
			for(int i = i1; i< i1+i2;i++) {
				for(int j = j1; j < j1+j2; j++) {
					map[i][j] = k;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int k = 1; k<= N;k++) {
			int cnt = 0;
			
			for(int i = 0 ; i < 101; i++) {
				for(int j = 0 ; j < 101;j++) {
					if(map[i][j] == k)cnt++;
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
}
