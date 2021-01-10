package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1021_회전하는큐 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 1; i <= N;i++) {
			list.add(i);
		}
		int answer = 0;
		int num = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M;i++) {
			num = Integer.parseInt(st.nextToken());
			
			while(num != list.get(0)) {
				if(list.indexOf(num) <= list.size() / 2) {
					int tmp = list.getFirst();
					list.removeFirst();
					list.addLast(tmp);
				}else {
					int tmp = list.getLast();
					list.removeLast();
					list.addFirst(tmp);
				}
				answer++;
			}
			list.removeFirst();
		}
		System.out.println(answer);
	}
}
