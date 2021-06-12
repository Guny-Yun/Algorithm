package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1427_소트인사이드 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		Arrays.parallelSort(arr);
		for(int i = arr.length-1 ; i >= 0;i--) {
			System.out.print(arr[i]);
		}
	}
}
