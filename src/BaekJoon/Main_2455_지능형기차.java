package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2455_지능형기차 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> in = new LinkedList<Integer>();
		Queue<Integer> out = new LinkedList<Integer>();
		for(int i =0;i<4;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			out.add(Integer.parseInt(st.nextToken()));
			in.add(Integer.parseInt(st.nextToken()));
		}
		int cnt = 0;
		int max = 0;
		for(int i = 0; i<4;i++) {
			cnt -= out.poll();
			cnt = cnt+in.poll();
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}

}
