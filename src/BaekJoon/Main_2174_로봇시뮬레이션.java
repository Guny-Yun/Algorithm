package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2174_로봇시뮬레이션 {
	static int[][] map;
	static int err_robot, err_num, crash_Y;
	static boolean flag;
	static Robot[] list;
	static int A, B;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken()); // 가로 x
		B = Integer.parseInt(st.nextToken()); // 세로 y
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 로봇 수
		int M = Integer.parseInt(st.nextToken()); // 명령 수
		
		map = new int[B+1][A+1];
		list = new Robot[N+1];
		for(int i = 1 ; i <= N ;i++) {
			String[] in = br.readLine().split(" ");
			int x = Integer.parseInt(in[0]);
			int y = B + 1 - Integer.parseInt(in[1]);
			char dir = in[2].charAt(0);
			list[i] = new Robot(x,y,dir);
			map[y][x] = i;
		}
		err_robot = 0;
		err_num = 0;
		flag = true;
		for(int i = 0 ; i < M;i++) {
			String[] in2 = br.readLine().split(" ");
			int num = Integer.parseInt(in2[0]); // 로봇 번호
			char comm = in2[1].charAt(0); // L R F
			int cnt = Integer.parseInt(in2[2]); // 반복 횟수
			
			move(num, comm, cnt);
			if(!flag) break;
		
		}
		if(flag)System.out.println("OK");
		else {
			if(err_num == 1) {
				System.out.println("Robot " + err_robot + " crashes into the wall");
			}else {
				System.out.println("Robot " + err_robot + " crashes into robot " + crash_Y);
			}
		}
	}
	
	static int[] dy = {-1,1,0,0}; // 북 남 서 동
	static int[] dx = {0,0,-1,1}; // N S W E
	public static void move(int num, char comm, int cnt) {
		if(comm == 'F') {
			int y = list[num].y;
			int x = list[num].x;
			char dir = list[num].dir;
			for(int i = 0 ; i < cnt; i++) {
				if(dir == 'N') {
					int ny = y + dy[0];
					if(ny == 0) {
						err_num = 1;
						err_robot = num;
						flag = false;
						break;
					}else if(map[ny][x] != 0) {
						err_num = 2;
						crash_Y = map[ny][x];
						err_robot = num;
						flag = false;
						break;
					}// N
					map[y][x] = 0;
					map[ny][x] = num;
					y = ny;
					list[num].y = y;
				}else if(dir == 'W') {
					int nx = x +dx[2];
					if(nx == 0) {
						err_num = 1;
						flag = false;
						err_robot = num;
						break;
					}else if(map[y][nx] != 0) {
						err_num = 2;
						crash_Y = map[y][nx];
						err_robot = num;
						flag = false;
						break;
					}// W
					map[y][x] = 0;
					map[y][nx] = num;
					x = nx;
					list[num].x = x;
				}else if(dir == 'S') {
					int ny = y + dy[1];
					if(ny > B) {
						err_num = 1;
						err_robot = num;
						flag = false;
						break;
					}else if(map[ny][x] != 0) {
						err_num = 2;
						err_robot = num;
						crash_Y = map[ny][x];
						flag = false;
						break;
					}// S
					map[y][x] = 0;
					map[ny][x] = num;
					y = ny;
					list[num].y = y;
				}else if(dir == 'E') {
					int nx = x + dx[3];
					if(nx > A) {
						err_num = 1;
						err_robot = num;
						flag = false;
						break;
					}else if(map[y][nx] != 0) {
						err_num = 2;
						err_robot = num;
						crash_Y = map[y][nx];
						flag = false;
						break;
					}
					map[y][x] = 0;
					map[y][nx] = num;
					x = nx;
					list[num].x = x;
				}
			}
		}else {
			for(int i = 0 ; i < cnt;i++) {
				rot(num, comm);
			}
		}
	}
	public static void rot(int num, char comm) {
		char dir = list[num].dir;
		if(comm == 'L') {
			if(dir == 'N') dir = 'W';
			else if(dir == 'W')dir = 'S';
			else if(dir == 'S')dir = 'E';
			else if(dir == 'E')dir = 'N';
		}else if(comm == 'R') {
			if(dir == 'N') dir = 'E';
			else if(dir == 'E') dir = 'S';
			else if(dir == 'S') dir = 'W';
			else if(dir == 'W') dir = 'N';
		}
		list[num].dir = dir;
	}
	static class Robot{
		int x;
		int y;
		char dir;
		public Robot(int x, int y, char dir){
			this.x = x;
			this.y = y;
			this.dir = dir;
		}
	}
}
