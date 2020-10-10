package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2475_검증수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int chk = 0;
		for(int i = 0; i < 5;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			chk += tmp * tmp;
		}
		System.out.println(chk % 10);
	}

}
