package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1158_요세푸스문제 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=  Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =1 ; i <= N; i++) {
			q.offer(i);
		}
		while(!q.isEmpty()) {
			for(int i = 0 ; i < K-1;i++) {
				int tmp = q.poll();
				q.offer(tmp);
			}
			list.add(q.poll());
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i = 0 ; i < N;i++) {
			if(i == N-1) {
				sb.append(list.get(i) + ">");
				break;
			}
			sb.append(list.get(i) + ", ");
		}
		System.out.println(sb);
	}
}
