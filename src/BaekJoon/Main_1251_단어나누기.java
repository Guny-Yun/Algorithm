package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1251_단어나누기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();
		String answer = cutReverse(s,0,1,len-1);
		
		for(int i = 0 ; i < len-2; i++) {
			for(int j = i+1; j <len-1; j++) {
				String tmp = cutReverse(s,i,j,len-1);
				if(answer.compareTo(tmp) > 0) {
					answer = tmp;
				}
			}
		}
		System.out.println(answer);
	}
	public static String cutReverse(String str, int s, int m, int len) {
		String re = null;
		
		re = Reverse(str.substring(0,s+1));
		
		re+= (Reverse(str.substring(s+1,m+1)));
		
		re += (Reverse(str.substring(m+1,len+1)));
		
		return re;
	}
	
	public static String Reverse(String s) {
		return((new StringBuffer(s)).reverse().toString());
	}
}
