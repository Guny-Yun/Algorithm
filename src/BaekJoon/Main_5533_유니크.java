package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_5533_유니크 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[][] arr = new int[N][3];
		for(int i =0  ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < 3;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0 ; i < 3;i++) {
			for(int j = 0 ; j < N;j++) {
				int tmp = arr[j][i];
				for(int k = 0 ; k < N;k++) {
					if(k != j && tmp == arr[k][i]) {
						arr[j][i] = arr[k][i] = 0;
					}
				}
			}
		}
		for(int i = 0 ; i < N;i++) {
			int sum = 0;
			for(int j = 0 ; j < 3;j++) {
				sum += arr[i][j];
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}

}
