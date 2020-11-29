package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_5014_스타트링크 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[F+1];
		boolean[] visit = new boolean[F+1];
		Arrays.fill(arr,-1);
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(S);
		visit[S] = true;
		while(!q.isEmpty()) {
			int tmp = q.poll();
			visit[tmp] = true;
			if(tmp == G) {
				break;
			}
			if(tmp + U <= F && !visit[tmp + U]) {
				q.add(tmp + U);
				arr[tmp+ U] = arr[tmp] + 1;
				visit[tmp + U] = true;
			}
			if(tmp - D > 0 && !visit[tmp - D]) {
				q.add(tmp - D);
				arr[tmp - D] = arr[tmp] + 1;
				visit[tmp - D] = true;
			}
		}
		if(arr[G] == -1 && S != G) {
			System.out.println("use the stairs");
		}else {
			System.out.println(arr[G] + 1);
		}
	}
}
