package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4796_캠핑 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			if(L == 0 && P == 0 && V == 0) {
				break;
			}
			int r = V / P;
			int q = V % P;
			int answer = r * L + Math.min(L, q);
			sb.append("Case " + cnt + ": " + answer + "\n");
			cnt++;
		}
		System.out.println(sb);
	}
}
