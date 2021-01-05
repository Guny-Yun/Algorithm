package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main_1655_가운데를말해요 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> maxheap = new PriorityQueue<>();
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N ;i++) {
			int in = Integer.parseInt(br.readLine());
			
			if(maxheap.size() >minheap.size())minheap.add(in);
			else maxheap.add(in * -1);
			
			if(!maxheap.isEmpty() && !minheap.isEmpty() && (maxheap.peek() * -1) > minheap.peek()) {
				int max = maxheap.poll() * -1;
				int min = minheap.poll();
				
				maxheap.add(min * -1);
				minheap.add(max);
			}
			sb.append(maxheap.peek() * -1 + "\n");
		}
		System.out.println(sb);
	}
}
