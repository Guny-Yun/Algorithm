package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16956_늑대와양 {
	static int R, C;
	static char[][] map;
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		for(int i = 0 ; i < R;i++) {
			char[] tmp = br.readLine().toCharArray();
			for(int j = 0 ; j < C;j++) {
				map[i][j] = tmp[j];
			}
		}
		int answer = 1;
		here:for(int i = 0 ; i < R;i++) {
			for(int j = 0 ; j < C;j++) {
				if(map[i][j] == 'W') {
					for(int k = 0 ; k <4;k++) {
						int ni = i + di[k];
						int nj = j + dj[k];
						if(ni>=0 && nj >=0 && ni<R && nj <C && map[ni][nj] == '.') {
							map[ni][nj] = 'D';
						}
						else if(ni>=0 && nj >=0 && ni<R && nj <C && map[ni][nj] == 'S') {
							answer = 0;
							break here;
						}
					}
				}
			}
		}
		
		if(answer == 1) {
			System.out.println(answer);
			for(int i = 0 ; i < R;i++) {
				for(int j = 0 ; j < C;j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
		else System.out.println(answer);
	}

}
