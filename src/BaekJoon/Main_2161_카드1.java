package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2161_카드1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N;i++) {
			q.offer(i);
		}
		
		while(true) {
			int out = q.poll();
			sb.append(out + " ");
			
			if(q.isEmpty())break;
			
			int in = q.poll();
			q.offer(in);
		}
		System.out.println(sb);
		
	}

}
