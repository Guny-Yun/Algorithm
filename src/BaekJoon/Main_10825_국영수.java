package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_10825_국영수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] table = new String[N][4];
		for(int i = 0 ; i < N;i++) {
			table[i] = br.readLine().split(" ");
		}
		
		Arrays.sort(table,new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
					if(Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
						if(Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
							return o1[0].compareTo(o2[0]);
						}
						return Integer.compare(Integer.parseInt(o2[3]), Integer.parseInt(o1[3]));
					}
					return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
				}
				return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));
			}
			
		});
		for(int i = 0 ; i < N;i++) {
			System.out.println(table[i][0]);
		}
	}

}
