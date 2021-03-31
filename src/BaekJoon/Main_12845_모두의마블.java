package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_12845_모두의마블 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		int maxCard = 0;
		
		for(int i = 0 ; i < N;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			sum += tmp;
			maxCard = Math.max(tmp, maxCard);
		}
		System.out.println(sum + maxCard*(N-2));
	}
}
