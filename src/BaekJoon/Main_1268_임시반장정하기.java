package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1268_임시반장정하기{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] info = new int[N+1][5];
		int[] cntarr = new int[N+1];
		boolean[][] who = new boolean[N+1][N+1];
		for(int i = 1 ; i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<5;j++) {
				info[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력끝
		
		for(int i = 0; i<5;i++) {//1학년~5학년
			for(int j = 1; j<=N;j++) {//1번학생~N번학생까지
				int co = info[j][i];
				for(int k = 1;k<=N;k++) {
					if(info[k][i] ==co) {
						who[j][k] = true;
					}
				}
			}
		}
		int max = 0;
		int maxidx = 0;
		for(int i = 1 ; i<=N;i++) {
			int cnt = 0;
			for(int j = 1;j<=N;j++) {
				if(who[i][j])cnt++;
			}
			cntarr[i] = cnt;
		}
		for(int i = N;i>0;i--){
			if(max<=cntarr[i]) {
				max = cntarr[i];
				maxidx = i;
			}
		}
		System.out.println(maxidx);
	}
}