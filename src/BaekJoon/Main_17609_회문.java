package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_17609_회문 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String word = "";
		int answer = 0;
		
		for(int i=0; i<T; i++) {
			word = br.readLine();
			answer = pal(word);
			
			System.out.println(answer);
		}
	}
	public static int pal(String w) {
		int res = 0;
		int left = 0, right = w.length()-1;
		
		while(left <= right) {
			if(w.charAt(left) == w.charAt(right)) {
				left++;
				right--;
			}else {
				int l = left;
				int r = right;
				l++;
				while(l <= r) {
					if(w.charAt(l) == w.charAt(r)) {
						l++;
						r--;
					}else {
						res++;
						break;
					}
				}
				l = left;
				r = right;
				r--;
				
				while(l <= r) {
					if(w.charAt(l) == w.charAt(r)) {
						l++;
						r--;
					}else {
						res++;
						break;
					}
				}
				return res;
			}
			
		}
		return res;
	}

}
