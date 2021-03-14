package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1034_램프 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] in = new String[N];
		for(int i = 0 ; i < N ;i++) {
			st = new StringTokenizer(br.readLine());
			in[i] = st.nextToken();
		}
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		
		int oe = K % 2;
		if(K > 50) K = 50;
		
		int max = 0;
		int idx = -1;
		for(int i = 0 ; i < N ;i++) {
			int zero = 0;
			String tmp = in[i];
			for(int j = 0 ; j < M ;j++) {
				if(tmp.charAt(j) == '0')zero++;
			}
			if(zero %2 != oe)continue;
			
			int pat = 1;
			for(int k = 0 ; k < N;k++) {
				if(+k != i && tmp.equals(in[k]))pat++;
			}
			if(zero <= K && pat > max) {
				max = pat;
				idx = i;
			}
		}
		if(idx != -1) {
			System.out.println(max);
		}else System.out.println(0);
	}
}
