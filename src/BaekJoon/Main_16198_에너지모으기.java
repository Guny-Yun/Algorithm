package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_16198_에너지모으기 {
	static int N, answer;
	static ArrayList<Integer> list;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<>();
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			list.add(tmp);
		}
		answer = 0;
		dfs(N, 0);
		System.out.println(answer);
	}
	
	public static void dfs(int n, int sum) {
		if(n == 2) {
			answer = Math.max(answer, sum);
			return;
		}
		for(int i = 1 ; i < list.size() - 1; i++) {
			int cal = list.get(i-1) * list.get(i+1);
			int energy = list.get(i);
			list.remove(i);
			dfs(n-1, sum+cal);
			list.add(i,energy);
		}
	}


}
