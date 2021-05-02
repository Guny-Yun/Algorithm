package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main_7785_회사에있는사람 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			String[] in = br.readLine().split(" ");
			if (in[1].equals("enter")) {
				set.add(in[0]);
			} else if (in[1].equals("leave")) {
				set.remove(in[0]);
			}
		}
		StringBuilder sb = new StringBuilder();
		Iterator<String> iter = set.iterator();
		ArrayList<String> list = new ArrayList<>();
		while(iter.hasNext()) {
			list.add(iter.next());
		}
		for(int i = list.size()-1; i>= 0; i--) {
			sb.append(list.get(i) + "\n");
		}
		System.out.println(sb);
	}
}
