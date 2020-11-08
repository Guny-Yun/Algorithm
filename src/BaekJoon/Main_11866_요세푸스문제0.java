package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_11866_요세푸스문제0 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken()) -1;
		int curidx = K;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		LinkedList<Integer> q = new LinkedList<>();
		for(int i = 1 ; i <= N;i++) {
			q.add(i);
		}
		while(q.size() != 1) {
			sb.append(q.get(curidx).toString() + ", ");
			q.remove(curidx);
			curidx = (curidx + K) % q.size();
		}
		sb.append(q.pop().toString() + ">");
		System.out.println(sb);
	}

}
