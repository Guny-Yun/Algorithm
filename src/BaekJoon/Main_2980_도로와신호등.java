package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2980_도로와신호등 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[][] signal = new int[L+1][2];
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			int D = Integer.parseInt(st.nextToken()); // D
			int R = Integer.parseInt(st.nextToken()); // R
			int G = Integer.parseInt(st.nextToken()); // G
			signal[D][0] = R;
			signal[D][1] = G;
		}
		int time = 1;
		for(int i = 1; i <= L;i++) {
			if(signal[i][0] != 0) {
				int tmp = time % (signal[i][0] + signal[i][1]);
				if(tmp >= 0 && tmp <= signal[i][0]) {
					time += (signal[i][0] - tmp);
				}
			}
			time++;
		}
		System.out.println(time-1);
	}
}
