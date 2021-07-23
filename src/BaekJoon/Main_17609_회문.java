package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_17609_회문 {
	static char[] arr;
	static String s;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int i=0; i<T; i++) {
			s = br.readLine();
			arr=s.toCharArray();
			int left=0;
			int right=s.length()-1;
			if(check(left,right)) {
				System.out.println(0);
				continue;
			}
			if(checkS(left,right)) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
		}
	}
	public static boolean check(int l, int r) {
		while(l <= r) {
			if(arr[l] != arr[r])return false;
			
			l++;
			r--;
		}
		return true;
	}
	public static boolean checkS(int l, int r) {
		while(l <= r) {
			if(arr[l] != arr[r]) {
				boolean a = check(l+1, r);
				boolean b = check(l, r-1);
				
				if(!a && !b) {
					return false;
				}else 
					return true;
			}
			l++;
			r--;
		}
		return true;
	}
}
