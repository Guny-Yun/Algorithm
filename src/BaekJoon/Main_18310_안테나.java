package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_18310_안테나 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] home = new int[N];
		for(int i = 0; i < N;i++) {
			home[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(home);
		
		System.out.println(home[N/2 - 1]);
				
		
	}

}
