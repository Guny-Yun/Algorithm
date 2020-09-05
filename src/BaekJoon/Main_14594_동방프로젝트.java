package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14594_동방프로젝트 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 최대 100
		int M = Integer.parseInt(br.readLine()); // 최대 100
		StringTokenizer st;
		
		int cnt = 0;
		int[] arr = new int[N+1];
		for(int i = 0 ; i < arr.length;i++) {// 동아리 방의 번호를 배정하고
			arr[i] = i;
		}
		
		for(int k = 0 ; k < M;k++) { // M번 반복
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(arr[x] == x) { // 만약 x번 방이 아직 허물지 않았던 곳이라면
				int tmp = x;
				for(int i = x; i <= y; i++) {
					arr[i] = tmp; // x번부터 y번 방까지 x로
				}
			}
			else { // 만약 X번 방이 허물었던 곳이라면
				int tmp = arr[x];
				for(int i = x; i <= y; i++) {
					arr[i] = tmp; // x번 부터 y번 방까지 x인덱스의 방번호로 채움
				}
			}
		}
		for(int i = 1; i <= N;i++) { // 현재방과 다음방이 다르면 벽이 아직 있다고 판단 cnt++
			if(arr[i] == i) cnt++;
		}
		System.out.println(cnt);
	}

}
