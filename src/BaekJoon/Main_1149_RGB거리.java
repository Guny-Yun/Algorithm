package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1149_RGB거리{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int[][] cost = new int[N][3];
		for(int i = 0 ; i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j<3;j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 1 ; i<N;i++) {
			cost[i][0] = Math.min(cost[i-1][1] + cost[i][0],  cost[i-1][2] + cost[i][0]); 
			cost[i][1] = Math.min(cost[i-1][0] + cost[i][1] , cost[i-1][2] + cost[i][1]); 
			cost[i][2] = Math.min(cost[i-1][1] + cost[i][2] , cost[i-1][0] + cost[i][2]); 
		}
		Arrays.sort(cost[N-1]);
		System.out.println(cost[N-1][0]);
		
	}

}
