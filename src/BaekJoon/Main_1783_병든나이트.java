package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1783_병든나이트 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int answer = 1;
		if(N == 1);
		else if(N == 2) {
			answer = Math.min(answer, (M+1)/2);
		}else {
			if(M < 7)answer = Math.min(M, 4);
			else answer = M-2;
		}
		System.out.println(answer);
		
	}

}
