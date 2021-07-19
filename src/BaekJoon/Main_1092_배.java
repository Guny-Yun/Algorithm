package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1092_배 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> c = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			c.add(Integer.parseInt(st.nextToken()));
		}	
		Collections.sort(c, Collections.reverseOrder());
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> box = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(box, Collections.reverseOrder());
		
		if (c.get(0) < box.get(0))
			System.out.println("-1");
		else {
			int t = 0;
			while (!box.isEmpty()) {
				int idx = 0;
				for (int i = 0; i < c.size();) {
					if (idx == box.size())
						break;
					else if (c.get(i) >= box.get(idx)) {
						box.remove(idx);
						i++;
					} else
						idx++;
				}
				t++;
			}
			System.out.println(t);
		}
	}
}
