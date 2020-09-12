package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1969_DNA {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] map = new char[N][M];
		for(int i = 0 ; i < N;i++) {
			map[i] = br.readLine().toCharArray();
		}
		int[] dna = new int[4];
		
		int dis = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < M;i++) {
			Arrays.fill(dna, 0);
			int max_idx = 0;
			int cur_cnt = 0;
			for(int j = 0 ; j < N;j++) {
				char cur = map[j][i];
				switch(cur) {
				case 'A':
					dna[0]++;
					break;
				case 'C':
					dna[1]++;
					break;
				case 'G':
					dna[2]++;
					break;
				case 'T':
					dna[3]++;
					break;
				}
				
			}
			for(int k = 0 ; k < 4;k++) {
				if(cur_cnt < dna[k]) {
					max_idx = k;
					cur_cnt = dna[k];
				}
			}
			if(max_idx == 0) {
				sb.append("A");
				dis = dis + N - cur_cnt;
			}else if(max_idx == 1) {
				sb.append("C");
				dis = dis + N - cur_cnt;
			}else if(max_idx == 2) {
				sb.append("G");
				dis = dis + N - cur_cnt;
			}else if(max_idx == 3) {
				sb.append("T");
				dis = dis + N - cur_cnt;
			}
		}
		System.out.println(sb);
		System.out.println(dis);
	}

}
