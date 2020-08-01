package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2477_참외밭 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] dir = new int[6];
		int[] dis = new int[6];
		int max_se = 0;
		int max_ga = 0;
		int min_1 = 0;
		int min_2 = 0;
		for(int i = 0 ; i < 6; i++) {
			 st = new StringTokenizer(br.readLine());
			 dir[i] = Integer.parseInt(st.nextToken());
			 dis[i] = Integer.parseInt(st.nextToken());
			 if(dir[i] == 1 || dir[i] == 2) {
				 max_ga = Math.max(max_ga, dis[i]);
			 }
			 if(dir[i] == 3 || dir[i] == 4) {
				 max_se = Math.max(max_se, dis[i]);
			 }
		}// Input end
		
		for(int i = 1; i <= 6 + 3; i++) {
			if(dir[(i-1) % 6] == dir[(i+1) % 6] && dir[i%6] == dir[(i+2) % 6]) {
				min_1 = dis[i%6];
				min_2 = dis[(i+1)%6];
				break;
			}
		}
		
		
		int area = (max_ga * max_se) - (min_1 * min_2);
		System.out.println(area * K);
	}
}
