package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5515_2016년요일맞추기 {

	static int[] cal = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int month = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			
			int cnt=0;
			for(int i = 0;i<month-1;i++){
				cnt += cal[i];
			}
			cnt+= day;
			System.out.println("#" + tc + " " +(cnt+3)%7);
		}
	}
}
