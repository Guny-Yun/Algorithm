package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_10814_나이순정렬 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] table = new String[N][2];
		for(int i = 0 ; i < N;i++) {
			table[i] = br.readLine().split(" ");
		}
		Arrays.sort(table, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N;i++) {
			sb.append(table[i][0] + " " + table[i][1] + "\n");
		}
		System.out.println(sb);
	}

}
