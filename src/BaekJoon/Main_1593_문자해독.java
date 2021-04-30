package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1593_문자해독 {
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		char[] W = br.readLine().toCharArray();
		char[] S = br.readLine().toCharArray();
		int[] w_alpha = new int[52];
		int[] s_alpha = new int[52];
		
		int answer = 0;
		for(int i = 0 ; i < w; i++) {
			if('a' <= W[i] && W[i] <= 'z') {
				w_alpha[W[i] - 'a']++;
			}else {
				w_alpha[W[i] - 'A' + 26]++;
			}
		}
		for(int i = 0 ; i < w; i++) {
			if('a' <= S[i] && S[i] <= 'z') {
				s_alpha[S[i] - 'a']++;
			}else {
				s_alpha[S[i] - 'A' + 26]++;
			}
		}
		
		int start = 0;
		int end = w;
		if(chk(w_alpha, s_alpha)) answer++;
		
		while(end < s) {
			if('a' <= S[start] && S[start] <= 'z') {
				s_alpha[S[start] - 'a']--;
			}else {
				s_alpha[S[start] - 'A' + 26]--;
			}
			start++;
			
			if('a' <= S[end] && S[end] <= 'z') {
				s_alpha[S[end] - 'a']++;
			}else {
				s_alpha[S[end] - 'A' + 26]++;
			}
			end++;
			
			if(chk(w_alpha,s_alpha))answer++;
		}
		System.out.println(answer);
	}
	public static boolean chk(int[] arr, int[] brr) {
		for(int i = 0 ; i < 52; i++) {
			if(arr[i] != brr[i])return false;
		}
		return true;
	}
}
