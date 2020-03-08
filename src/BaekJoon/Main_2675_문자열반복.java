package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2675_문자열반복 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int tc = 1; tc<=T;tc++) {
			st= new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			String in = st.nextToken();
			
			for(int i = 0; i<in.length();i++) {
				for(int j = 0; j<N;j++) {
					System.out.print(in.charAt(i));
				}
			}
			System.out.println();
		}
		
	}

}
