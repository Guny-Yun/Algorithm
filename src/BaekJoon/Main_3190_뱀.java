package BaekJoon;

import java.io.*;
import java.util.*;
/*
 * 사과를 먹으면 뱀 길이가 늘어남
 * 자기자신의 몸 or 벽에 부딪히면 끝
 * N x N 보드 위, 몇몇 칸에 사과
 * 시작 뱀 위치는 맨 위, 좌측에
 * 시작 뱀 길이 1
 * 오른쪽(->)을 향함
 * 첫째 줄 N입력 <=100
 * 다음 K 개의 줄(사과 수)
 * 행 열
 * L 방향변환 횟수
 * 정수 문자
 */
public class Main_3190_뱀 {
	static int N, K, L, time;
	static int[][] map;
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		map = new int[N+1][N+1];
		time = 0; // 몇초만에 끝날지
		Queue<int[]> snake = new LinkedList<>();
		for(int i = 0 ; i < K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			map[r][c] = 2; // 사과
		}
		map[1][1] = 1; // 뱀 시작
		L = Integer.parseInt(br.readLine());
		
		char[] x = new char[10001]; // 명령어를 담을 곳
		
		for(int i = 0 ; i < L;i++) {
			String[] in = br.readLine().split(" ");
			x[Integer.parseInt(in[0])] = in[1].charAt(0);
		}
		int dir = 0;
		int i = 1, j = 1; 
		for(int t = 0; t < x.length; t++){
			snake.offer(new int[]{i,j});
			if(x[t] == 'L') {//왼
				dir -= 1;
				if(dir < 0)dir = 3;
			}
			else if(x[t] == 'D') {//오
				dir += 1;
				if(dir > 3)dir = 0;
			}
			int[] new_position = movehead(dir,i,j); // 머리 움직이기
			int ni = new_position[0];	// 새로운 i 좌표
			int nj = new_position[1];	// 새로운 j 좌표
			time++;
			if(isEnd(ni,nj))break; 		// 벽에 부딪히거나
			if(map[ni][nj] == 1)break; 	// 몸통이거나
			
			if(map[ni][nj] != 2) {// 사과가 없으면 길이 줄기
				int[] temp = snake.poll();
				map[temp[0]][temp[1]] = 0;
			}
			map[ni][nj] = 1;
			i = ni;
			j = nj;
		}
		System.out.println(time);
		
	}
	public static boolean isEnd(int i, int j) {//true면 게임 끝
		if(i == 0 || j == 0 || i >N || j > N)return true;
		return false;
	}
	public static int[] movehead(int dir,int i, int j) {//머리가 이동할 곳 리턴
		switch(dir) {
		case 0:// 우
			j += 1;
			break;
		case 1:// 하
			i += 1;
			break;
		case 2:// 좌
			j -= 1;
			break;
		case 3:// 상
			i -= 1;
			break;
		}
		return new int[] {i,j};
	}
}
