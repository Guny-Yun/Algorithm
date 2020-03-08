package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1697_숨바꼭질 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		boolean[] visit = new boolean[100001];
		int cnt = 0;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {N,0});
		while(!que.isEmpty()) {	
			int[] tmp = que.poll();
			if(tmp[0] != K) {
				int[] p = {-1,1,tmp[0]};
				for(int i = 0 ; i<3;i++) {
					int nN = tmp[0]+p[i];
					if(nN>=0 && nN <100001 && !visit[nN]) {
						visit[nN] = true;
						que.add(new int[] {nN,tmp[1]+1});
					
					}
					
				}
			}
			else {
				cnt = tmp[1];
				break;
			}
		}
		System.out.println(cnt);
	}
}
