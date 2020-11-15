package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_2696_중앙값구하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int tc = 1; tc<= T;tc++) {
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			int cnt = 0;
			sb.append((N +1)/2 + "\n");
			
			
			for(int i = 0 ; i < N;i++) {
				if(i % 10 == 0) {
					st = new StringTokenizer(br.readLine());
				}
				int tmp = Integer.parseInt(st.nextToken());
				list.add(tmp);
				Collections.sort(list);
				
				if(i % 2 == 0) {
					if(cnt == 9 || i == N-1) {
						sb.append(list.get(i/2) + "\n");
						cnt  = 0;
					}else {
						sb.append(list.get(i/2) + " ");
					}
					cnt++;
				}
			}
		}
		System.out.println(sb);
	}
}
