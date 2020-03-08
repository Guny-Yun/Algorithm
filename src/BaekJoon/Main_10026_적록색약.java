package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10026_적록색약 {
	static int N,abn_cnt,n_cnt;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	static char[][] map;
	static boolean[][] visit;
	public static void ndfs(int i, int j) {
		visit[i][j] = true;
		for(int k= 0;k<4;k++) {
			int ni = i+di[k];
			int nj = j+dj[k];
			if(ni>=0 && ni<N && nj>=0 &&nj<N && map[i][j] == map[ni][nj] && !visit[ni][nj]) {
				ndfs(ni,nj);
			}
		}
		
	}
	public static void abndfs(int i,int j) {
		visit[i][j] = true;
		for(int k= 0;k<4;k++) {
			int ni = i+di[k];
			int nj = j+dj[k];
			if(ni>=0 && ni<N && nj>=0 &&nj<N && !visit[ni][nj]) {
				if((map[i][j] == 'G' || map[i][j] =='R') &&(map[ni][nj] == 'G' || map[ni][nj] =='R') || (map[i][j]=='B' && map[ni][nj]=='B'))
				abndfs(ni,nj);
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		visit = new boolean[N][N];
		for(int i = 0; i<N;i++) {
			String in = br.readLine();
			for(int j = 0 ;j<N;j++) {
				map[i][j] = in.charAt(j);
			}
		}
		abn_cnt = 0;
		n_cnt = 0;
		for(int i = 0; i<N;i++) {
			for(int j =0;j<N;j++) {
				if(!visit[i][j]) {
					ndfs(i,j);
					n_cnt++;
				}
			}
		}
		
		visit= new boolean[N][N];
		for(int i = 0; i<N;i++) {
			for(int j =0;j<N;j++) {
				if(!visit[i][j]) {
					abndfs(i,j);
					abn_cnt++;
				}
			}
		}
		
		System.out.println(n_cnt+ " " + abn_cnt);
	}

}
