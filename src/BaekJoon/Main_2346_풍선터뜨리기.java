package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_2346_풍선터뜨리기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Ball> deq = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N;i++) {
			int val = Integer.parseInt(st.nextToken());
			deq.add(new Ball(i,val));
		}
		
		int cur = 0;
		int tmp_val = 0;
		
		for(int i = 0 ; i < N;i++) {
			if(tmp_val > 0) {
				for(int j = 0; j < tmp_val-1; j++) {
					cur++;
					if(cur >= deq.size()) cur = 0;
				}
			}else if(tmp_val < 0) {
				tmp_val *= -1;
				for(int j = 0 ; j < tmp_val; j++) {
					cur--;
					if(cur < 0)cur = deq.size()-1;
				}
			}
			Ball b = deq.get(cur);
			tmp_val = b.val;
			System.out.print(b.order + " ");
			deq.remove(cur);
			if(cur == deq.size())cur = 0;
		}
		
	}
	static class Ball{
		int order;
		int val;
		public Ball(int order, int val) {
			this.order = order;
			this.val = val;
		}
	}
}
