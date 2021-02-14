package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1342_행운의문자열 {
	static char[] arr;
	static int answer = 0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = br.readLine().toCharArray();
		
		Arrays.parallelSort(arr);
		if(check(arr))answer++;
		
		while(perm()) {};
		
		System.out.println(answer);
	}
	
	public static boolean check(char[] tmp) {
		for(int i = 0 ; i < tmp.length-1;i++) {
			if(tmp[i] == tmp[i+1])return false;
		}
		return true;
	}
	public static boolean perm() {
		int n = arr.length -1;
		while(n > 0 && arr[n-1] >= arr[n])n--;
		
		if(n <= 0)return false;
		
		int m = arr.length -1;
		while(arr[m] <= arr[n-1])m--;
		
		char tmp = arr[n-1];
		arr[n-1] = arr[m];
		arr[m] = tmp;
		
		m = arr.length-1;
		while(n < m) {
			tmp = arr[n];
			arr[n] = arr[m];
			arr[m] = tmp;
			n++;
			m--;
		}
		if(check(arr)) answer++;
		
		return true;
	}
}
