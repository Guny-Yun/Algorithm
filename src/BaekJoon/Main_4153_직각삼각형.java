package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4153_직각삼각형 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr = new int[3];
		while(true) {
			st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			Arrays.sort(arr);
			int a2 = (int) Math.pow(arr[0], 2);
			int b2 = (int) Math.pow(arr[1], 2);
			int c2 = (int) Math.pow(arr[2], 2);
			if(a2 + b2 == c2) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
}
