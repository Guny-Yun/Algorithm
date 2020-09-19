package BaekJoon;

import java.io.*;
import java.util.*;
	
public class Main_1138_한줄로서기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] hei = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N;i++) {
			hei[i] = Integer.parseInt(st.nextToken());
		}
		List<Integer> list = new ArrayList<>();
		for(int i = N; i >=1 ; i--) {
			list.add(hei[i],i);
		}
		for(int a : list) {
			System.out.print(a + " ");
		}
	}
}
