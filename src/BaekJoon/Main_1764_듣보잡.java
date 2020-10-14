package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1764_듣보잡 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> list = new ArrayList<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for(int i = 0 ; i < N;i++) {
			String in = br.readLine();
			set.add(in);
		}
		for(int i = 0 ; i < M;i++) {
			String in = br.readLine();
			if(set.contains(in)) {
				list.add(in);
			}
		}
		StringBuilder sb = new StringBuilder();
		Collections.sort(list);
		sb.append(list.size() + "\n");
		for(int i = 0 ; i < list.size();i++) {
			sb.append(list.get(i) + "\n");
		}
		System.out.println(sb);
	}

}
