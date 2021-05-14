package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2331_반복수열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		list.add(A);
		while(true) {
			int tmp = list.get(list.size()-1);
			
			int num = 0;
			
			while(tmp != 0) {
				num += (int)Math.pow(tmp % 10, (double)P);
				tmp /= 10;
			}
			if(list.contains(num)) {
				int answer = list.indexOf(num);
				System.out.println(answer);
				break;
			}
			list.add(num);
		}
	}
}
