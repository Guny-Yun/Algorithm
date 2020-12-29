package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_20055_컨베이어벨트위의로봇 {
	static int N, K, left, right;
	static int[] map;
	static boolean[] robot;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[N * 2];
		robot = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N * 2; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		right = N;
		left = 0;
		int answer = 0;
		
		while(0 < K) {
			answer++;
			Belt();
			Robot();
			newRobot();
		}
		System.out.println(answer);
	}
	public static void Belt() {
		left--;
		right--;
		if(left == -1) left = N * 2 -1;
		
		if(right == -1) right = N * 2 -1;
		
		for(int i = N-2 ; i >= 0 ; i--) {
			if(robot[i]) {
				robot[i] = false;
				if(i+1 < N-1) robot[i+1] = true;
			}
		}
	}
	
	public static void Robot() {
		for(int i = N-2 ; i>= 0 ; i--) {
			if(robot[i]) {
				int next = left + i + 1;
				if(next >= N * 2) next -= 2 * N;
				
				if(!robot[i + 1] && map[next] >= 1) {
					robot[i] = false;
					if(i+1 < N-1) robot[i+1] = true;
					
					map[next]--;
					if(map[next] == 0) K--;
				}
			}
		}
	}
	
	public static void newRobot() {
		if(!robot[0] && map[left] > 0) {
			robot[0] = true;
			map[left]--;
			if(map[left] == 0) K--;
		}
	}

}
