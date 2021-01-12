package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_14405_피카츄 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		
		boolean flag = false;
		String[] word = {"pi","ka","chu"};
		
		for(int i = 0 ; i < in.length();i++) {
			flag = false;
			for(int j = 0 ; j < word.length;j++) {
				if(i + word[j].length() > in.length()) continue;
				
				String tmp = in.substring(i, i+word[j].length());
				
				if(tmp.equals(word[j])) {
					i += tmp.length() -1;
					flag = true;
					continue;
				}
			}
			if(!flag) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
