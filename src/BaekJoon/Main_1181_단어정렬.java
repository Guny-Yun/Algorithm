package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main_1181_단어정렬 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<>();
		
		for(int i = 0; i < N;i++) {
			hs.add(br.readLine());
		}
		ArrayList<String> list = new ArrayList<>(hs);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length()) {
					return 1; // 길면 뒤로
				}else if(s1.length() < s2.length()) {
					return -1;
				}else {
					return s1.compareTo(s2);
				}
			}
			
		});
		for(String s : list) {
			System.out.println(s);
		}
	}

}
