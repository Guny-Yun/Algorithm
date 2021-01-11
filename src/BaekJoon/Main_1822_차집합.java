package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_1822_차집합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		TreeSet<Integer> ts = new TreeSet<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			ts.add(tmp);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(ts.contains(tmp))ts.remove(tmp);
		}
		System.out.println(ts.size());
		Iterator<Integer> it = ts.iterator();
		for(int i = 0 ; i < ts.size();i++) {
			System.out.print(it.next() + " ");
		}
	}
}
