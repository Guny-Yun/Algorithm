package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main_10866_덱 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> dq = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N;i++) {
			String[] comm = br.readLine().split(" ");
			
			switch(comm[0]) {
			case "push_front":
				int tmp1 = Integer.parseInt(comm[1]);
				dq.addFirst(tmp1);
				break;
			case "push_back":
				int tmp2 = Integer.parseInt(comm[1]);
				dq.addLast(tmp2);
				break;
			case "pop_front":
				if(dq.isEmpty()) {
					System.out.println(-1);
				}else System.out.println(dq.pollFirst());
				break;
			case "pop_back":
				if(dq.isEmpty()) {
					System.out.println(-1);
				}else System.out.println(dq.pollLast());
				break;
			case "size":
				System.out.println(dq.size());
				break;
			case "empty":
				if(dq.isEmpty()) {
					System.out.println(1);
				}else System.out.println(0);
				break;
			case "front":
				if(dq.isEmpty()) {
					System.out.println(-1);
				}else System.out.println(dq.peekFirst());
				break;
			case "back":
				if(dq.isEmpty()) {
					System.out.println(-1);
				}else System.out.println(dq.peekLast());
				break;
			}
		}
		
	}

}
