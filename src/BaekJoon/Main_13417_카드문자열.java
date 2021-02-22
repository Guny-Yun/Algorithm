package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_13417_카드문자열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String card;
		String answer;
		
		for(int tc = 1 ; tc<= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			card = br.readLine().replaceAll(" ", "");
			answer = card.substring(0,1);
			for(int i = 1; i< N;i++) {
				if(card.charAt(i) <= answer.charAt(0))answer = card.charAt(i) + answer;
				else answer += card.charAt(i);
			}
			System.out.println(answer);
		}
	}
}
