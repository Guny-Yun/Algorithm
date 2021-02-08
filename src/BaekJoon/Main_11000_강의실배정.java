package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_11000_강의실배정 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[i][0] = a;
			arr[i][1] = b;
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0])return o1[1] - o2[1];
				else return o1[0] - o2[0];
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i < N; i++) {
			int end = arr[i][1];
			if(!pq.isEmpty() && pq.peek() <= arr[i][0])
				pq.poll();
			pq.offer(end);
		}
		System.out.println(pq.size());
	}
}
