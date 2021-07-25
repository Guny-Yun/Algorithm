package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_12101_123더하기2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<String>[] arr = new ArrayList[N+3];
		for(int i = 0 ; i <= N+2; i++)arr[i] = new ArrayList<>();
		arr[1].add("1");
		arr[2].add("1+1");
		arr[2].add("2");
		arr[3].add("1+2");
		arr[3].add("1+1+1");
		arr[3].add("2+1");
		arr[3].add("3");
		
		for(int i = 4; i<= N;i++) {
			for(int j =1 ; j<=3; j++) {
				for(String op : arr[i-j]) {
					arr[i].add(op + "+" + j);
				}
			}
		}
		if(arr[N].size() < K) {
			System.out.println(-1);
		}else {
			Collections.sort(arr[N]);
			System.out.println(arr[N].get(K-1));
		}
	}
}
