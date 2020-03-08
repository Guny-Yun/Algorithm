package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Solution_D3_8500_극장좌석 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] people = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i <N;i++) {
				people[i] = Integer.parseInt(st.nextToken());
			}//입력끝
			Arrays.parallelSort(people);
			int sum = N;
			for(int i = 0 ; i<N;i++) {
				sum+= people[i];
			}
			sum+=people[N-1];
			System.out.println("#" + tc + " " + sum);
		}
	}
}
