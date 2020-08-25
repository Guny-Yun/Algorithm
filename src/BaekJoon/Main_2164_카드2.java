package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main_2164_카드2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= N;i++) {
			q.offer(i);
		}
		int answer = 0;
		while(true) {
			if(q.size() == 1) {
				answer = q.poll();
				break;
			}
			q.poll();
			int last_in = q.poll();
			q.offer(last_in);
		}
		System.out.println(answer);
		
	}

}
