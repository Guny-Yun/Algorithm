package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_14425_문자열집합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;
		HashSet<String> hs = new HashSet<>();
		for(int i = 0 ; i < N;i++) {
			hs.add(br.readLine());
		}
		for(int i = 0 ; i < M;i++) {
			String target = br.readLine();
			if(hs.contains(target))cnt++;
		}
		System.out.println(cnt);
	}

}
