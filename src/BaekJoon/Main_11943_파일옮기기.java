package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11943_파일옮기기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[2];
		int[] o = new int[2];
		StringTokenizer st;
		for(int i = 0 ; i < 2; i++) {
			st=  new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			o[i] = Integer.parseInt(st.nextToken());
		}
		int s1= a[0] + o[1];
		int s2 = a[1] + o[0];
		System.out.println(Math.min(s1, s2));
	}
}
