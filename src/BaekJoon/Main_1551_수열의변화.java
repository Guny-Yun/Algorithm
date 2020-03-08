package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1551_수열의변화 {
	static long[] res,arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		arr = new long[n];
		st=  new StringTokenizer(br.readLine(),",");
		for(int i = 0 ; i < n;i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		for(int i = 0; i<k;i++) {
			res = new long[n-i-1];
			for(int j = 0 ; j<res.length;j++) {
				res[j] = arr[j+1]-arr[j];
			}
			arr = res.clone();
		}
		for(int i = 0 ; i<arr.length-1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]);
	}
}
