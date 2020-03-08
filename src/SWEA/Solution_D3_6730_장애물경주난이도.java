package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_6730_장애물경주난이도 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T;tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<arr.length;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}//입력끝
			int[] up = new int[arr.length-1];
			int[] down = new int[arr.length-1];
			
			for(int i = 0; i<arr.length-1;i++) {
				if(arr[i] < arr[i+1]) up[i] = arr[i+1] -arr[i];
				else if(arr[i] > arr[i+1])down[i] = arr[i]-arr[i+1];
			}
			Arrays.sort(up);
			Arrays.sort(down);
			System.out.println("#" + tc + " " + up[up.length-1] + " " + down[down.length-1]);
		}
	}
}
