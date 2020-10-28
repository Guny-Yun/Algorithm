package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2607_비슷한단어 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String stan = br.readLine();
		int[] alpha = new int[26];
		int cnt = 0;
		for(int i = 0 ; i < stan.length();i++) {
			alpha[stan.charAt(i) - 'A']++;
		}
		
		for(int i = 0 ; i < N-1;i++) {
			int[] tmp_alpha = alpha.clone();
			String tmp = br.readLine();
			int diff_cnt = 0;
			
			for(int k = 0 ; k < tmp.length();k++) {
				if(tmp_alpha[tmp.charAt(k) - 'A']> 0) {
					diff_cnt++;
					tmp_alpha[tmp.charAt(k) - 'A']--;
				}
			}
			if(stan.length()-1 == tmp.length() && diff_cnt == tmp.length()) {
				cnt++;
			}else if(stan.length() == tmp.length()) {
				if(diff_cnt == stan.length() || diff_cnt == stan.length()-1) cnt++;
			}else if(stan.length() + 1 == tmp.length()) {
				if(diff_cnt == stan.length())cnt++;
			}
			
		}
		System.out.println(cnt);
		
	}

}
