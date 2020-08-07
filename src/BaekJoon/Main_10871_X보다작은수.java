package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10871_X보다작은수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder("");
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(tmp < X) sb.append(tmp + " ");
		}

		System.out.println(sb.toString());

	}

}
