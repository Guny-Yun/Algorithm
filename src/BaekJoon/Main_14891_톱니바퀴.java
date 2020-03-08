package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14891_톱니바퀴 {
	static int[][] gear = new int[4][8];
	static int[][] comm;

	static public void clock_rotate(int[] gear) {// 명령어 1 일떄 시계방향
		int tmp = gear[7];
		gear[7] = gear[6];
		gear[6] = gear[5];
		gear[5] = gear[4];
		gear[4] = gear[3];
		gear[3] = gear[2];
		gear[2] = gear[1];
		gear[1] = gear[0];
		gear[0] = tmp;
	}

	static public void counter_clock_rotate(int[] gear) {// 명령어 -1 일떄 반시계방향
		int tmp = gear[0];
		gear[0] = gear[1];
		gear[1] = gear[2];
		gear[2] = gear[3];
		gear[3] = gear[4];
		gear[4] = gear[5];
		gear[5] = gear[6];
		gear[6] = gear[7];
		gear[7] = tmp;
	}

	static public int score_calc() { // 마지막 점수 계산 메소드
		int res = 0;
		for (int i = 0; i < 4; i++) {
			res += gear[i][0] * Math.pow(2, i);
		}
		return res;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 4; i++) {
			String in = br.readLine();
			for (int j = 0; j < 8; j++) {
				gear[i][j] = in.charAt(j) - '0';
			}
		} // 톱니바퀴 입력 끝
		int N = Integer.parseInt(br.readLine()); // 명령어 수
		comm = new int[N][2];// N개의 명령어 [톱니번호][시계1 or 반시계-1]
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			comm[i][0] = Integer.parseInt(st.nextToken());
			comm[i][1] = Integer.parseInt(st.nextToken());
		} // 명령어 입력 끝

		for (int cm = 0; cm < N; cm++) {
			boolean[] chk = new boolean[4];
			int g = comm[cm][0] - 1;// 몇번째 톱니바퀴?
			int dir = comm[cm][1];// 1 시계 or - 1 반시계
			chk[g] = true;
			for (int i = g; i > 0; i--) {
				if (gear[i][6] != gear[i - 1][2])
					chk[i - 1] = true;
				else
					break;
			}
			for (int i = g; i < 3; i++) {
				if (gear[i][2] != gear[i + 1][6])
					chk[i + 1] = true;
				else
					break;
			}

			if (dir == 1)
				clock_rotate(gear[g]);
			else if (dir == -1)
				counter_clock_rotate(gear[g]);
			int ndir = dir;
			for (int i = g; i > 0; i--) {// 왼쪽으로
				if (chk[i - 1]) {
					ndir *= -1;
					if (ndir == 1)
						clock_rotate(gear[i - 1]);
					else if (ndir == -1)
						counter_clock_rotate(gear[i - 1]);
				}
			}
			for (int i = g; i < 3; i++) {// 오른쪽으로
				if (chk[i + 1]) {
					dir *= -1;
					if (dir == 1)
						clock_rotate(gear[i + 1]);
					else if (dir == -1)
						counter_clock_rotate(gear[i + 1]);
				}
			}
		} // comm수행 끝
		System.out.println(score_calc());// 결과 출력
	}
}
