package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11651_좌표정렬하기2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int[][] arr = new int[N][2];
		
		for(int i = 0 ; i < N;i++) {
			st=  new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[i][1] = a;
			arr[i][0] = b;
		}
		Arrays.sort(arr, (e1,e2) ->{
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			}else {
				return e1[0] - e2[0];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N;i++) {
			sb.append(arr[i][1] + " " + arr[i][0] + "\n");
		}
		System.out.println(sb);
	}
}
