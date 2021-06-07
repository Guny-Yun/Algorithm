package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14582_오늘도졌다 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int home[] = new int[9];
		int away[] = new int[9];
		
		for(int i = 0 ; i < 9;i++) home[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < 9;i++) away[i] = Integer.parseInt(st.nextToken());
		
		int hs = 0;
		int as = 0;
		for(int i = 0 ; i < 9;i++) {
			hs += home[i];
			if(hs > as) {
				System.out.println("Yes");
				return;
			}
			as += away[i];
		}
		System.out.println("No");
	}

}
