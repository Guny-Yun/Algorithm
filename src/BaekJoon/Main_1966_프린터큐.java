package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_1966_프린터큐 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T  = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int tc = 1; tc <= T; tc++) {
			Queue<Integer> q = new LinkedList<>();
			Queue<Integer> pri = new LinkedList<Integer>();
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int cnt = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < N;i++) {
				int tmp = Integer.parseInt(st.nextToken());
				q.offer(tmp);
				pri.offer(i);
			}
			h:while(true) {
				int max = q.peek();
				for(int i = 1; i <q.size();i++) {
					if(max < ((LinkedList<Integer>) q).get(i)) {
						int tmp = q.poll();
						int imp = pri.poll();
						q.offer(tmp);
						pri.offer(imp);
						continue h;
					}
				}
				int prt = q.poll();
				int num = pri.poll();
				cnt++;
				if(num == M) {
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}
