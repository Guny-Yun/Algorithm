package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11723_집합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		
		boolean[] bit = new boolean[21];
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N;i++) {
			String[] in = br.readLine().split(" ");
			int num;
			switch(in[0]) {
			case "add":
				num = Integer.parseInt(in[1]);
				bit[num] = true;
				break;
			case "remove":
				num = Integer.parseInt(in[1]);
				bit[num] = false;
				break;
			case "check":
				num = Integer.parseInt(in[1]);
				if(bit[num]) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;
			case "toggle":
				num = Integer.parseInt(in[1]);
				bit[num] = !bit[num];
				break;
			case "all":
				Arrays.fill(bit, true);
				break;
			case "empty":
				Arrays.fill(bit, false);
				break;
			}
		}
		System.out.println(sb);
	}
}
