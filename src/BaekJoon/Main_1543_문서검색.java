package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1543_문서검색 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String doc = br.readLine();
		String word = br.readLine();
		
		int cnt = 0;
		
		for(int i = 0 ; i < doc.length() - word.length() + 1;i++) {
			String tmp = doc.substring(i, i + word.length());
			if(tmp.equals(word)) {
				cnt++;
				i = i + word.length() - 1;
			}
		}
		System.out.println(cnt);
	}

}
