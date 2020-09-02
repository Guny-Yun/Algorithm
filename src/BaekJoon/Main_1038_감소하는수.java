package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1038_감소하는수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N > 1022)System.out.println(-1);
		else if(N < 10) {
			System.out.println(N);
		}
		else {
			Queue<Long> q = new LinkedList<>();
			int cnt =0;
			for(int i = 1; i < 10;i++) {
				q.add(new Long(i));
				cnt++;
			}
			while(cnt < N) {
				long k = q.poll();
				long tmp =  k %10;
				for(int i = 0 ; i < tmp; i++) {
					q.add(k * 10 + i);
					cnt++;
					if(cnt == N) {
						System.out.println(k * 10 + i);
						break;
					}
				}
			}
		}
		
	}

}
