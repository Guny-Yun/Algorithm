package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_1431_시리얼번호 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i = 0 ; i < N;i++) {
			arr[i] = br.readLine();
		}
		Arrays.parallelSort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length())
				return -1;
				else if(o1.length() == o2.length()) {
					if(cal(o1)== cal(o2)) {
						return o1.compareTo(o2);
					}else {
						return Integer.compare(cal(o1), cal(o2));
					}
				}else return 1;
			}
		});
		for(String s : arr) {
			System.out.println(s);
		}
	}
	public static int cal(String s) {
		int sum = 0;
		for(int i = 0 ; i < s.length();i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum += s.charAt(i) - '0';
			}
		}return sum;
	}
}
