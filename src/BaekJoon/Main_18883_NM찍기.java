package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18883_NM찍기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		for(int i = 0 ; i < N; i++) {
			for(int j = 0 ; j < M; j++) {
				if(j == M-1) {
					sb.append(cnt + "\n");
					cnt++;
				}
				else {
					sb.append(cnt+ " ");
					cnt++;
				}
			}
		}
		System.out.println(sb.toString());
	}

}
