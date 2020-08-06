import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_5567_결혼식 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		boolean[] visit = new boolean[n+1];
		boolean[][] friend = new boolean[n+1][n+1];
		ArrayList<Integer> list = new ArrayList<>();
		int answer = 0;
		StringTokenizer st;
		for(int i = 0 ; i < m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a== 1) {
				list.add(b);
				answer++;
				visit[b] = true;
			} // 1번 상근이의 친구
			friend[a][b] = true;
			friend[b][a] = true; // 전체 관계도 체크
		}
 		for(int v : list) { //한다리 건너 친구 찾기
 			for(int i = 2;i <= n;i++) {
 				if(friend[v][i] && !visit[i]) { // 상근이의 한 다리 건너 친구면서, 직접적인 친구가 아닐때
 					answer++;
 					visit[i] = true;
 				}
 			}
 		}
 		System.out.println(answer);
	}
	

}
