package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_13335_트럭 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int t = 0;
		int wei = 0;
		int[] truck = new int[n];
		Queue<Integer> q = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n;i++) {
			truck[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < n;i++) {
			while(true) {
				if(q.isEmpty()) {
					q.offer(truck[i]);
					t++;
					wei += truck[i];
					break;
				}else if(q.size() == w) {
					wei -= q.poll();
				}else {
					if(wei + truck[i] > L) {
						q.offer(0);
						t++;
					}else {
						q.offer(truck[i]);
						t++;
						wei += truck[i];
						break;
					}
				}
			}
		}
		System.out.println(t+w);
	}

}
