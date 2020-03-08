package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14503_로봇청소기 {
	static int[][] map;
	static int N,M,robot_dir;
	static int[] di = {-1,0,1,0};//북 서 남 동
	static int[] dj = {0,1,0,-1};
	public static boolean isPossible(int i, int j) {
		int ni = i+di[robot_dir];
		int nj = j+dj[robot_dir];
		if(ni>=0 && nj >=0 && ni<N && nj<M && map[ni][nj] == 0)
			return true;
		else 
			return false; 
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		int robot_i = Integer.parseInt(st.nextToken());
		int robot_j = Integer.parseInt(st.nextToken());
		robot_dir = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for(int i =0 ; i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int res = 0;
		while(true) {//0이면 북쪽, 1이면 동쪽, 2면 남쪽, 3이면 서쪽
			if(map[robot_i][robot_j] == 0) {
				map[robot_i][robot_j]=9;
				res++;
			}
			boolean flag = false;
			
			for(int i = 0 ; i<4;i++) {
				robot_dir -=1;
				if(robot_dir <0)robot_dir=3;
				if(isPossible(robot_i,robot_j)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				robot_i += di[robot_dir];
				robot_j += dj[robot_dir];
			}
			else {
				robot_i -= di[robot_dir];
				robot_j -= dj[robot_dir];
				if(robot_i<0 || robot_j <0|| robot_i >=N || robot_j >= M || map[robot_i][robot_j] == 1 )
					break;
			}
		}
		
		System.out.println(res);
		
	}

}