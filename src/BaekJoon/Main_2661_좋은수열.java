package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2661_좋은수열 {
	static int N;
	static boolean end = false;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		dfs("");
		
	}
	public static void dfs(String answer) {
		if(end) return;
		
		if(answer.length() == N) {
			System.out.println(answer);
			end = true;
			return;
		}else {
			for(int i = 1; i <= 3;i++) {
				if(good(answer + i)) {
					dfs(answer + i);
				}
			}
		}
	}
	public static boolean good(String s) {
		int len = s.length() / 2;
		for(int i = 1; i<= len;i++) {
			if(s.substring(s.length() -i).equals(s.substring(s.length() -2 * i, s.length() - i))){
				return false;
			}
		}
		return true;
	}

}
