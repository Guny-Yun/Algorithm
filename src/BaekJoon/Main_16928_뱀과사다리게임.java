package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_16928_뱀과사다리게임 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] ladder = new int[101];
		boolean[] visit = new boolean[101];
		
		for (int i = 0; i < N + M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			ladder[a] = b; // 사다리든 뱀이든 저장
		}
		int answer = 0;
		visit[1] = true;
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] { 1, 0 }); // 1 = 시작위치 0 = 횟수cnt

		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			int cur_pos = tmp[0]; // 현재칸
			int cnt = tmp[1]; // 현재칸까지 걸린 횟수

			if (cur_pos == 100) {
				answer = cnt;
				break;
			}
			// 크기 101 짜리 ladder -> | 인덱스 = 뱀or사다리 위치, 내용 = 뱀or사다리 타면 도착하는 곳 |
			for (int i = 1; i <= 6; i++) {
				int new_pos = cur_pos + i; // 새 칸 = 현재칸 + 주사위값 i(1~6)
				
				if (new_pos <= 100) {
					if (ladder[new_pos] != 0) { // 주사위 + 현재칸이  0이 아니면 (뱀 or 사다리)
						if(!visit[ladder[new_pos]]) { // 사다리 or 뱀타고 갈 곳이 아직 안간곳이라면
							visit[ladder[new_pos]] = true;
							q.offer(new int[] { ladder[new_pos], cnt + 1 }); // 새 칸 , 카운트 + 1 offer
						}
					} else  { // 주사위 + 현재칸 = 앞으로 갈 칸에 사다리나 뱀이 없으면 (ladder[new_pos] 가 0이면)
						if(!visit[new_pos]) { // + 아직 가본 곳이 아니면
							visit[new_pos] = true; // 방문
							q.offer(new int[] {new_pos, cnt + 1 }); // 새 칸 , 카운트 + 1 offer
						}
					}
				}
			}
		}
		System.out.println(answer);

	}

}
